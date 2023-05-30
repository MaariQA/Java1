package ENCAPSULATION;

public class Employee {
    private int employeeid;           // private access modifier added
    private String employeeName;      // private access modifier added
    private double employeesalary;    // private access modifier added
    private int age;                 // private access modifier added

    // Constructor to set initial values for employee data
    public Employee(int id, String name, double salary, int age) {
        this.employeeid = id;
        this.employeeName = name;
        this.employeesalary = salary;
        this.age = age;
    }

    // Getter methods to access employee data
    public int getEmployeeid() {
        return this.employeeid;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getEmployeesalary() {
        return this.employeesalary;
    }

    public int getAge() {
        return this.age;
    }

    // Setter methods to modify employee data
    public void setEmployeeid(int id) {
        this.employeeid = id;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeesalary(double salary) {
        this.employeesalary = salary;
    }

    public void setAge(int age) {
        if (age > 0) {                   // added age validation check
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "abc", 54000, 30);

        employee.setEmployeeid(100);
        employee.setEmployeeName("Cyber");
        employee.setEmployeesalary(100);
        employee.setAge(-30);              // corrected employee age value
       // employee.setAge(-20);
        
        // Output employee data
        System.out.println(employee.getEmployeeid());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeesalary());
        System.out.println(employee.getAge());
    }
}
