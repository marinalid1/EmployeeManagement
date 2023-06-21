import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManagement {
    // set private employees List
    private List<Employee> employees;

    // EmployeeManagement constructor
    public EmployeeManagement() {
        // EmployeeManagement constructor sets employees equal to new ArrayList
        employees = new ArrayList<>();
    }

    // addEmployee method takes Employee Type employee
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

        // if not employeeFound
        if (!employeeFound) {
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
        // if not employeeFound
        if (!employeeFound) {
            // print out that employee not found
            System.out.println("Employee not found");
        }
    }

    /*
    // Needs updating with firstName, lastName etc...
    // updateEmployeeName takes int id and String name and update Employee name
    public void updateEmployeeName(int id, String name) {
        // set employeeFound to false
        boolean employeeFound = false;
        // for employee in employees
        for (Employee employee : employees) {
            // if employee equals id
            if (employee.getId() == id) {
                // Update the name of the employee
                employee.setName(name);
                // Print update confirmation with the updated values
                System.out.println("Employee name updated: " + employee.getId() + ", " + employee.getName());
                // set employeeFound to true
                employeeFound = true;
                // break out of loop
                break;
            }
        }
        // if not employeeFound
        if (!employeeFound) {
            // print Employee not found
            System.out.println("Employee not found");
        }
    }
    */


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
        employeeManagement.addEmployee(new Employee("John", "Smith", "123 main st", "accounting", 1234567890));
        employeeManagement.addEmployee(new Employee("Jane", "Smith", "123 main st", "sales", 1233219000));
        employeeManagement.addEmployee(new Employee("Peter", "Johnson","500 Parkway", "logistics",1234567890));
        employeeManagement.addEmployee(new Employee("Sarah", "Daniels", "1 Circle Drive", "Customer Service", 1231231234));

        // print all employees in employee management
        employeeManagement.printAll();

        // Finding an employee by ID
        employeeManagement.findEmployeeById(4);

        // delete employee
        employeeManagement.deleteEmployee(3);

        // update employee
        //employeeManagement.updateEmployeeName(1, "James");

        // print all employees in employee management
        employeeManagement.printAll();
    }
}

