import java.time.LocalDate;
import java.util.Optional;

class Employee {
    // firstName instance
    private String firstName;
    // lastName instance
    private String lastName;
    // set instance of nextId to 1
    private static int nextId = 1;
    // set id instance
    private int id;
    // set address instance
    private String address;
    // set department instance
    private String department;
    //set phoneNumber instance
    private int phoneNumber;
    // set dob instance
    private LocalDate dob;


    // Employee constructor takes String name
    public Employee(String firstName, String lastName, String address, String department, int phoneNumber) {
        // set first name instance variable to the value passed as a parameter
        this.firstName = firstName;
        // set last name instance variable to the value passed as a parameter
        this.lastName = lastName;
        // set id instance variable to the current value of "nextId"
        this.id = nextId;
        // increment nextId
        nextId++;
        // set dob instance variable to the value passed as a parameter
        //this.dob = dob;
        // set address instance to the value passed in as parameter
        this.address = address;
        // set department instance to the value passed in as parameter
        this.department = department;
        // set phoneNumber instance variable to the value passed as a parameter
        this.phoneNumber = phoneNumber;
    }

    // getName method takes no parameters and returns String name
    public String getName() {
        /// return name
        return firstName + " " + lastName;
    }

    // setName method takes newFirstName and newLastName Strings and set firstName and lastName instances to it
    public void setName(String newFirstName, String newLastName) {
        // this.name equals newName
        this.firstName = newFirstName;
        // this.name equals newName
        this.lastName = newLastName;
    }

    // getId takes no parameters and returns int id
    public int getId() {
        // return id
        return id;
    }

    // Override toString method
    @Override
    // toString takes no parameters and returns String
    public String toString() {
        // retrun Stirng with employee id, firstName, lastName, address, department and phone
        return "Employee{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", department='" + department + '\'' + ", phoneNumber='" + phoneNumber +'\'' +'}';
    }
}