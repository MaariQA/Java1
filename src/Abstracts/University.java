package Abstracts;
public abstract class University {
	int age;
	private String name = "UOP";
	static String city = "pune";

	private void getSalary() 
	{
		System.out.println("getting my salary...");
	}
	// abstract + class is not allowed
	// public abstract final void library();
	
	// just final method can be defined as abstract in abstract class
	// public final void library();

	public final void library ()
	{
		System.out.println("library method is being called..."+this.name);
		getSalary();
	}
	public static void builiding() {
		System.out.println("buliding method is being called..");
	}
	// abstract methods
	public abstract void  admission();
	public abstract void account();

	// non abstract method
	public void getStudentDetails()
	{
		System.out.println("am getting student details...");
	}
	public static void main(String[] args) {
		// can not create an object of abstract class
		// University object = new University();
	}
	University()
	{
		System.out.println("University constructor create..constructor.");
	}
}