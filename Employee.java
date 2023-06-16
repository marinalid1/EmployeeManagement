class Employee {
    // name instance
    private String name;
    // set instance of nextId to 1
    private static int nextId = 1;
    // set id instance
    private int id;

    // Employee constructor takes String name
    public Employee(String name) {
        // set name instance variable to the value passed as a parameter
        this.name = name;
        // set id instance variable to the current value of "nextId"
        this.id = nextId;
        // increment nextId
        nextId++;
    }

    // getName method takes no parameters and returns String name
    public String getName() {
        /// return name
        return name;
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
        // retrun Stirng with employee id and name
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}