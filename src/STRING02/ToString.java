package STRING02;
public class ToString {
	//	int rollno;  
	//	String name;  
	//	String city;  
	//	
	//	ToString(int rollno, String name, String city){
	//		this.rollno=rollno;  
	//		this.name=name;  
	//		this.city=city;  
	//		 }  
	//	 public static void main(String args[]){ 
	//	ToString s1=new ToString(101,"Raj","Rohit");
	//	ToString s2=new ToString(101,"Maari","Virat");  
	//	System.out.println(s1);  // ToString@5d22bbb7
	//	System.out.println(s2);  // ToString@41a4555e
	//	
	////	System.out.println(s1.toString()); 
	////	System.out.println(s2.toString());  
	//       }}

	int rollno;  
	String name;  
	String city;  
	ToString(int rollno, String name, String city){
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	} 
	public String toString(){      //overriding the toString() method  
		return rollno+" "+name+" "+city;  
	}  
	public static void main(String args[]){  
	ToString s1=new ToString(101,"Raj","Rohit");  
	ToString s2=new ToString(101,"Maari","Virat"); 
	 System.out.println(s1);
	 System.out.println(s2);
	}
}




