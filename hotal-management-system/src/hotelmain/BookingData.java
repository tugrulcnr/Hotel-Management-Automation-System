package hotelmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BookingData extends FileControl{
    public static ArrayList<Booking> bookingList = new ArrayList<Booking>();
	
    public static ArrayList<Booking> getList(){
            return bookingList;
    }
        
    public static void fillList() throws IOException, NumberFormatException, ParseException {
		File roomsFile = new File("Booking.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }

		Scanner myReader = new Scanner(roomsFile);
	      while (myReader.hasNextLine()) {
	        String str = myReader.nextLine();
	        bookingList.add(new Booking(str.split(";")[0],str.split(";")[1],Integer.valueOf(str.split(";")[2]) , Integer.valueOf(str.split(";")[3]) , Float.valueOf(str.split(";")[4]) , str.split(";")[5]));
	      }
	      myReader.close();
    }
    
    public static void writeToFile() throws IOException {
    	File roomsFile = new File("Booking.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fw = new FileWriter(roomsFile,false);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0 ; i<bookingList.size();i++) {
			bw.write(bookingList.get(i).toString());
		}
		bw.close();
    }

    public static boolean isBooked(Date checkIn,Date checkOut,Rooms room) {
    	for(int i = 0;i<bookingList.size();i++) {
    		if(bookingList.get(i).room.getRoomNumber() == room.getRoomNumber()) {
    			if(checkIn.before(bookingList.get(i).checkIn) && checkOut.after(bookingList.get(i).checkIn)){
                            return true;
                        }else if(checkOut.after(bookingList.get(i).checkOut) && checkIn.before(bookingList.get(i).checkOut)){
                            return true;
                        }
    		}
    	}
    	return false;
    }
    

    public static float CalcCost(Date checkIn , Date checkOut,int numberOfPerson) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i=numberOfPerson;i<=Data.bigestRoom();i++){
            for(int j=0;j<Data.getRoomsPerson(i).size();j++){
                Date dateIn = sdf.parse(sdf.format(checkIn));
                Date dateOut = sdf.parse(sdf.format(checkOut));
                int number = Data.getRoomsPerson(i).get(j).getRoomNumber();
                if(!isBooked(checkIn, dateOut, Data.findWithRoomNumber(number))){
                    long dayMilisec = dateOut.getTime()-dateIn.getTime();
                    int day = (int) TimeUnit.DAYS.convert(dayMilisec,TimeUnit.MILLISECONDS) ;
                    float cost = (Data.getRoomsPerson(i).get(j).getAmount())*day;
                    if(day >=5){
                        cost = (float) (cost * 0.9);
                    }
                    return cost;
                }
            }
        }
        return (float)0;
    }

    public static Booking areYouSure(Date checkIn,Date checkOut,int numberOfPerson , String username) throws ParseException, IOException {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        	String checkInStr =sdf.format(checkIn);
		String checkOutStr = sdf.format(checkOut);
                Date dateIn = sdf.parse(sdf.format(checkIn));
                Date dateOut = sdf.parse(sdf.format(checkOut));
                int x = numberOfPerson;
                    while(x<=Data.bigestRoom()){
                        for(int i = 0;i<Data.getRoomsPerson(x).size();i++) {
    		if(!isBooked(dateIn , dateOut , Data.getRoomsPerson(x).get(i))) {
                        long dayMilisec = dateOut.getTime()-dateIn.getTime();
                        int day = (int) TimeUnit.DAYS.convert(dayMilisec,TimeUnit.MILLISECONDS);
                        float f = (Data.getRoomsPerson(x).get(i).getAmount())*day;                        
                        if(day >=5){
                            f = (float) (f * 0.9);
                        }
                        Booking b = new Booking(checkInStr, checkOutStr, Data.getRoomsPerson(x).get(i).getRoomNumber(), numberOfPerson, f , username);
                        return b;
    		}
                }
                x = x+1;
                    }
    	return null;
    
    }
    
    
    
    
}
