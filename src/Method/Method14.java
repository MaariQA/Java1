// Employee Details
package Method;
public class Method14 {
	public static void  Employee(){ 
		String name;
		String address;
		int yearofjoining;
		int salary;
	}
	void setEmployeeDetails(String name,String address, int yearOfjoining,int salary) {
		name = name ;
		address = address;
		yearOfjoining = yearOfjoining;
		salary = salary;
	}
	void printEmployeeDetails(String name,String address, int yearOfjoining,int salary) {

		System.out.println(name + "\t" + address + "\t" + yearOfjoining + "\t" + salary);
	}
	public static void main(String[] args) {

		Employee04Runner employee1 = new Employee04Runner();
		Employee04Runner employee2 = new Employee04Runner();
		Employee04Runner employee3 = new Employee04Runner();

		employee1. name="Rober";
		employee1.Addres=" Wraje";
		employee1.Salary = 45000 ;
		employee1.yearofjoin = 2020;

		employee2. name="Sam";
		employee2.Addres=" Swargate";
		employee2.Salary = 34000 ;
		employee2.yearofjoin = 2021;

		employee3. name=" Jhon";
		employee3.Addres=" Wakad";
		employee3.Salary = 54000;
		employee3.yearofjoin = 2023;

		employee1. setemployeeDetails("Sam","Swargate",3400.2021);
		employee1. setemployeeDetails("Rober","Wakad",5600.2021);
		employee1. setemployeeDetails("Sam","Swargate",3400.2021);

		// print employee Details 
		employee1.printEmployeeDeatails();
		employee2.printEmployeeDeatails();
		employee3.printEmployeeDeatails();
	}}

