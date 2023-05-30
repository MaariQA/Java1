package Day28May2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Collection02.Student;

public class ArrayListOfStudent {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<>();
		Student s1 = new Student (300,"Akshaykumar");
		al.add(s1);
		Student s2 = new Student(200,"Rohit saraf");
		al.add(s2);
		al.add(new Student(100,"AjayDevgan"));
		al.add(new Student(400, "Laxhmikhant Berde"));
		System.out.println("Original list");
		System.out.println(al);
		
   Collections.sort(al, new ComparatorAscId());
   System.out.println("Sorted on Id ASC List: ");
   System.out.println(al);
   
   Collections.sort(al, new ComparatorDescId());
   System.out.println("Sorted on Id DESC List: ");
   System.out.println(al);
   
   Collections.sort(al, new ComparatorAscName());
   System.out.println("Sorted on Id ASC List: ");
   System.out.println(al);

	}

}
