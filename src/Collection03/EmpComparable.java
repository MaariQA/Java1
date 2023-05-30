package Collection03;
//Demonstration of sorting using comparable interface overriding compareTo method

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import Arrays02.Emp;
	
	public class EmpComparable {
		public static void main(String[] args) {
			List<Emp> al = new ArrayList<>();
			Emp e1 = new Emp (2001, "Virat" );
			Emp e2 = new Emp (1001, "Sachin");
			Emp e3 = new Emp (3001, "Dhoni" );
			Emp e4 = new Emp (5001, "Hardik");
			Emp e5 = new Emp (4001, "Rohit" );
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			al.add(e5);
			Collections.sort(al);
			System.out.println(al);
		}
	}
	