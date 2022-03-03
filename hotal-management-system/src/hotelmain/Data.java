package hotelmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data extends FileControl{
	private static ArrayList<Rooms> list = new ArrayList<Rooms>();
	
    public static ArrayList<Rooms> getList(){
    	return list;
    }
    public static void addRooms(Rooms r) throws IOException {
    	list.add(r);
    	writeToFile();
        System.out.println("write to file room");
    }
    
    public static void fillList() throws IOException {
		File roomsFile = new File("Rooms.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }

		Scanner myReader = new Scanner(roomsFile);
	      while (myReader.hasNextLine()) {
	        String str = myReader.nextLine();
	        list.add(new Rooms(Integer.valueOf(str.split(";")[0]),Integer.valueOf(str.split(";")[1]) , Integer.valueOf(str.split(";")[2]),Float.valueOf(str.split(";")[3]) ));
	      }
	      myReader.close();
    }
    public static void writeToFile() throws IOException {
    	File roomsFile = new File("Rooms.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fw = new FileWriter(roomsFile,false);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0 ; i<list.size();i++) {
			bw.write(list.get(i).toString());
		}

		bw.close();

    }
    public static Rooms findWithRoomNumber(int number) {
    	for(int i=0;i<list.size();i++) {
    		if(list.get(i).getRoomNumber() == number) {
    			return list.get(i);
    		}
    	}
    	return null;
    	
    }
    public static Rooms removeRoomWithNumber(int number) throws IOException {
    	list.remove(findWithRoomNumber(number));
    	writeToFile();
    	return findWithRoomNumber(number);
    }
    public static ArrayList<Rooms> getRoomsPerson(int person){
    	ArrayList<Rooms> rooms = new ArrayList<Rooms>();
    	for(int i=0;i<list.size();i++) {
    		if(list.get(i).getNumberOfPerson() == person) {
    			rooms.add(list.get(i));
    		}
    	}
    	return rooms;
    }
    public static Rooms updateRoomWithNumber(int number,int numberOfPerson,int type,float amount){
        Rooms r = findWithRoomNumber(number);
        int index = list.indexOf(r);
        Rooms newRoom = new Rooms(numberOfPerson, number, type, amount);
        list.set(index, newRoom);
        return newRoom;
    }
        
        public static int bigestRoom(){
            int temp = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getNumberOfPerson() > temp){
                temp = list.get(i).getNumberOfPerson();
            }
        }
        return temp;
    }
    
    
}
