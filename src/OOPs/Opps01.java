package OOPs;
public class Opps01 {

	// Age 1 is non instance variable having default value as a and is capable int 
	// primitive data type

	public static class Student {      // you want to new class without static
		int rollNo;                           // default value 0
		String name;                         // default value null
		char gender;                         // 'M',:Male,'F',Female  // default value ' '
		void showValues() {
			System.out.println(rollNo + ":" + name + ":" + gender);
		}
		
	 // 0 args constructor use defined
		Student(){
			System.out.println("I am indise a zero arg constructor");
			this.rollNo = 100;
			this.name  = "Virat";
			this.gender ='M';
		}
		
	// 3 args constructor 
		Student (int roolNo,String name,char gender){
			System.out.println("I am inside a 3 arg constructor");
			this.rollNo = 100;
			this.name  = name;
			this.gender =gender;
		}
		
	// 1 args constructor
		
		Student (int rollNo){
			this.rollNo = rollNo;
		}
		// 2 args constructor
		Student (int rollNo,char g){
			this.rollNo = rollNo;
			this.gender = g;
		}
		
	 public static void main(String[] args) {	
	        Student S1 = new Student() ;
	        S1.showValues();

	        Student S2 = new Student();
	        S2.showValues();

	        Student S3 = new Student(1, "Rohit", 'M');
	        S3.showValues();

	        Student S4 = new Student(2, "Shikhar", 'M');
	        S4.showValues();

	        Student S5 = new Student(3);
	        S5.showValues();

	        Student S6 = new Student(4, 'F');
	        S6.showValues();
		}
	}	
	}
	



		