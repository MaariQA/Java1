package Collection03;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class ArrayListOfStudent {

		public static void main(String[] args) {
			
	    List<Student> al = new ArrayList<>();
	    Student s1 = new Student(2001, "Virat" );
	    Student s2 = new Student(1001, "Sachin");
	    Student s3 = new Student(3001, "Dhoni" );
	    Student s4 = new Student(5001, "Hardik");
	    Student s5 = new Student(4001, "Rohit" );
	       al.add(s1);
	       al.add(s2);
	       al.add(s3);
	       al.add(s4); 
	       al.add(s5);
	     //  System.out.println(al);
	       
	       ComparatorAscId o1 = new ComparatorAscId();
	       Collections.sort(al,o1);
	       System.out.println("Asc on Id");
	       System.out.println(al);

	       System.out.println("Desc on Id");
	       Collections.sort(al, new ComparatorDescId());
	       System.out.println(al);
	       
	       System.out.println("Asc on Name");
	       Collections.sort(al, new ComparatorAscOnName());
	       System.out.println(al);
	       
	       System.out.println("Desc on Name");
	       Collections.sort(al, new ComparatorDescOnName());
	       System.out.println(al);
		}
	}
	