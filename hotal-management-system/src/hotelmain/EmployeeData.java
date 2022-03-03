/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeData {
    public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    
        public static void fillList() throws IOException {
		File roomsFile = new File("Employee.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }

		Scanner myReader = new Scanner(roomsFile);
	      while (myReader.hasNextLine()) {
	        String str = myReader.nextLine();
                if(str.split(";")[0].equals("HouseKeeper")){
                    HouseKeeper hk = new HouseKeeper();
                    hk.setEmployee(str.split(";")[0]);
                    hk.setName(str.split(";")[1]);
                    hk.setSurname(str.split(";")[2]);
                    hk.setID(str.split(";")[3]);
                    hk.setPhoneNumber(str.split(";")[4]);
                    hk.setSalary(Float.valueOf(str.split(";")[5]));
                    employeeList.add(hk);
                }else if(str.split(";")[0].equals("Receptionist")){
                    Receptionist r = new Receptionist();
                    r.setEmployee(str.split(";")[0]);
                    r.setName(str.split(";")[1]);
                    r.setSurname(str.split(";")[2]);
                    r.setID(str.split(";")[3]);
                    r.setPhoneNumber(str.split(";")[4]);
                    r.setSalary(Float.valueOf(str.split(";")[5]));
                    employeeList.add(r);
                }else if(str.split(";")[0].equals("Manager")){
                    Manager hk = new Manager();
                    hk.setEmployee(str.split(";")[0]);
                    hk.setName(str.split(";")[1]);
                    hk.setSurname(str.split(";")[2]);
                    hk.setID(str.split(";")[3]);
                    hk.setPhoneNumber(str.split(";")[4]);
                    hk.setSalary(Float.valueOf(str.split(";")[5]));
                    employeeList.add(hk);
                }
	        	
	      }
	      myReader.close();
    }
    
        public static void writeToFile() throws IOException {
    	File roomsFile = new File("Employee.txt");
	      if (roomsFile.createNewFile()) {
	        System.out.println("File created: " + roomsFile.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fw = new FileWriter(roomsFile,false);
		BufferedWriter bw = new BufferedWriter(fw);

		for(int i = 0 ; i<employeeList.size();i++) {
			bw.write(employeeList.get(i).toString());
		}

		bw.close();

    }
        public static Employee findEmployeeWithID(String id){
            for(int i = 0;i<employeeList.size();i++){
                if(employeeList.get(i).getID().equals(id)){
                    return employeeList.get(i);
                }
            }
            return null;
        }
        public static void registerNewEmployee(Employee e) throws IOException{
           employeeList.add(e);
           writeToFile();
            
        }
        public static void deleteEmployee(Employee e) throws IOException{
                    employeeList.remove(e);
                    writeToFile();
        }
        public static void editEmployeeWithID(Employee a) throws IOException{
                for(int i=0;i<employeeList.size();i++ ){
                if(employeeList.get(i).getEmployee().equals(a.getID())){
                    switch (a.getEmployee()) {
                        case "HouseKeeper":
                            {
                                HouseKeeper hk = (HouseKeeper) a;
                                employeeList.add(hk);
                                break;
                            }
                        case "Receptionist":
                            Receptionist r = (Receptionist) a;
                            employeeList.add(r);
                            break;
                        case "Manager":
                            {
                                Manager hk = (Manager) a;
                                employeeList.add(hk);
                                break;
                            }
                        default:
                            break;
                    }
                    writeToFile();
                }
            }
        }
    
}
