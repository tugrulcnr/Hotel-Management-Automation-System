/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmain;


public class HouseKeeper implements Employee{
    public String employee;
    public String name;
    public String surname;
    public String id;
    public String phoneNumber;
    public float salary;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public float getsalary() {
        return this.salary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
     @Override
    public String getEmployee() {
        return this.employee;
    }

    @Override
    public void setEmployee(String employee) {
        this.employee = employee;
    }

           @Override
       public String toString(){
           return this.employee+";"+this.name+";"+this.surname+";"+this.id+";"+this.phoneNumber+";"+String.valueOf(this.salary)+"\n";
       }

    
}
