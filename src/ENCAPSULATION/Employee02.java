package ENCAPSULATION;
public class Employee02 {
			private int eid;
			private float salary;
			private String name;

			public Employee02(int eid, float salary, String name) {
				this.eid = eid;
				this.salary = salary;
				this.name = name;
			}

			public int getEid() {
				return eid;
			}

			public void setEid(int eid) {
				this.eid = eid;
			}

			public float getSalary() {
				return salary;
			}

			public void setSalary(float salary) {
				this.salary = salary;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void showValue() {
				System.out.println("Employee ID: " + eid);
				System.out.println("Employee Name: " + name);
				System.out.println("Employee Salary: " + salary);
				System.out.println("-------");
			}

			public static void main(String[] args) {
				Employee02 e3 = new Employee02(3, 9876.56f, "Stiker");
				e3.showValue();

				System.out.println(e3.getEid());
				System.out.println(e3.getSalary());
				System.out.println(e3.getName());
				System.out.println("-------");

				e3.setEid(10);
				e3.setSalary(11111.12f);
				e3.setName("Hardik");
				e3.showValue();
			}
		}



