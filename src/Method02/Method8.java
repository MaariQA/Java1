// non static variable / properties/ characteristics/ attributes
package Method02;
public class Method8 {
	
	public static class Student {
	int rollNo; 
	String name;
	int age; char gender ;
	char division;
	private int std;
	static String SchoolName = "NES";
	
	public static void main(String[] args) {
		Student S1 = new Student();
		S1.rollNo = 100;
		S1. name = "Virat";
		S1.age = 33;
		S1. std =12;
		S1.gender = 'M';
		S1.division = 'z';
		System.out.println(S1);  // Student@3d012add 
		
		System.out.println(S1.rollNo);
		System.out.println(S1.name);
		System.out.println(S1.gender);
		System.out.println(S1.age);
		System.out.println(S1.std);
		System.out.println(S1.division);
		System.out.println(Student.SchoolName);
		System.out.println("----------------");
		
		Student S2 = new Student();
        S2.rollNo = 200;
		S2.gender = 'f';
		S2. name = "Rohit";
		S2.age = 23;
		S2. std =10;
		S2.division = 'A';
        Student .SchoolName = "Sainik School Satatr";
        
        System.out.println(S2.rollNo);
        System.out.println(S2.name);
        System.out.println(S2.age);
        System.out.println(S2.gender);
        System.out.println(S2.division);
        System.out.println(S2.std);
        System.out.println("Student.SchoolName");
        System.out.println("------------------");
        
        Student S3 = new Student();
        S3.rollNo = 300;
		S3.gender = 'M';
		S3. name = "Rahul";
		S3.age = 23;
		S3. std = 5;
		S3.division = 'B';
		
		System.out.println(S3.rollNo);
        System.out.println(S3.name);
        System.out.println(S3.age);
        System.out.println(S3.gender);
        System.out.println(S3.division);
        System.out.println(S3.std);
        System.out.println("Student.SchoolName");
	}
}
}

