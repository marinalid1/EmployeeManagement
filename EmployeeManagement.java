import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeManagement {
    // set private employees List
    private List<Employee> employees;

    public EmployeeManagement() {
        // EmployeeManagement constructor sets employees equal to new ArrayList
        employees = new ArrayList<>();
    }

    // addEMployee method takes Employee Type employee
    public void addEmployee(Employee employee) {
        // adds employee to ArrayList employees
        employees.add(employee);
    }

    public void deleteEmployee(int id) {
        // set boolean employeeFound to false
        boolean employeeFound = false;
        // for employee in employees
        for (Employee employee : employees) {
            // if employee id equlas id
            if (employee.getId() == id) {
                // temp stores employee name before removal
                String temp = employee.getName();
                // remove employee
                employees.remove(employee);
                // print confirmation message
                System.out.println("Employee: " + temp + " successfully removed");
                // if employeeFound set boolean to true
                employeeFound = true;
                // Exit the loop after removing the employee
                break; 
            }
        }

        // if employeeFound still equalls false
        if (employeeFound == false) {
            // print out that employee not found
            System.out.println("Employee not found");
        }
    }       


    // findEmployeeById takes int id and prints Employee name if it matches id, prints employee not found if no match found
    public void findEmployeeById(int id) {
        // set boolean employeeFound to false
        boolean employeeFound = false;
        // for employee in employees
        for (Employee employee : employees) {
            // if employee mathces id
            if (employee.getId() == id) {
                // return employee
                System.out.println("Employee Found: " + employee.getName());
                // if employeeFound set boolean to true
                employeeFound = true;
            }
        }
        // if employeeFound still equalls false
        if (employeeFound == false) {
            // print out that employee not found
            System.out.println("Employee not found");
        }
    }

    // printAll method prints all employees
    public void printAll() {
        // for employee in employees
        for (Employee employee: employees) {
            // print out employee
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        // create new instance of employeeManagement
        EmployeeManagement employeeManagement = new EmployeeManagement();

        // Adding employees to the list
        employeeManagement.addEmployee(new Employee("John"));
        employeeManagement.addEmployee(new Employee("Jane"));
        employeeManagement.addEmployee(new Employee("Peter"));
        employeeManagement.addEmployee(new Employee("Sarah"));

        // print all employees in employee management
        employeeManagement.printAll();

        // Finding an employee by ID
        employeeManagement.findEmployeeById(4);

        // delete employee
        employeeManagement.deleteEmployee(3);
    }
}

