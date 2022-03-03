package hotelmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Authentication extends FileControl{
	private static ArrayList<User> authList = new ArrayList<User>();



    
    public static void fillList() throws IOException {
		File roomsFile = new File("Authentication.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }

		Scanner myReader = new Scanner(roomsFile);
	      while (myReader.hasNextLine()) {
	        String str = myReader.nextLine();
	        	authList.add(new User(str.split(";")[0],str.split(";")[1], str.split(";")[2] , str.split(";")[3], Integer.valueOf(str.split(";")[4]),Boolean.valueOf(str.split(";")[5]) ));
	      }
	      myReader.close();
    }

    public static void writeToFile() throws IOException {
    	File roomsFile = new File("Authentication.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fw = new FileWriter(roomsFile,false);
		BufferedWriter bw = new BufferedWriter(fw);

		for(int i = 0 ; i<authList.size();i++) {
			bw.write(authList.get(i).toString());
		}

		bw.close();

    }
    
    public static boolean isUserNameExist(String userName) {
    	for(int i=0;i<authList.size();i++) {
    		if(authList.get(i).getUsername().equals(userName) ) {
    			return true;
    		}
    	}
    	return false;
    }

    public static boolean isAuthenticate(String userName,String password) {

        	for(int i=0;i<authList.size();i++) {
        		if(authList.get(i).getUsername().equals(userName)) {
        			if(authList.get(i).getPassword().equals(password)) {
        				return true;
        			}else {
        				return false;
        			}
        		}
        	}
        	return false;
    }
    
    public static boolean registeration(String username , String password, String mobileNumber, String eMail , int gender ) throws IOException {
    	if(isUserNameExist(username)) {
    		return false;
    	}else {
    		authList.add(new User(username , password , mobileNumber,eMail,gender));
    		writeToFile();
    		return true;
    	}
    }

    public static User remove(String userName , String password) throws IOException {
    	for(int i=0;i<authList.size();i++) {
    		if(authList.get(i).getUsername().equals(userName) && authList.get(i).getPassword().equals(password)) {
    			User user;
    			user = authList.remove(i);
    			writeToFile();
    			return user;
    		}
    	}
    	return null;
    }

    public static User findUserWithUsername(String username) {
    	for(int i=0;i<authList.size();i++) {
    		if(authList.get(i).getUsername().equals(username)) {
    			return authList.get(i);
    		}
    	}
    	return null;
    }
}
