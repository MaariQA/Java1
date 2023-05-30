package Arrays02;

import java.util.Arrays;

public class ArrayClassDemoObjects {

	public static void main(String[] args) {

		Emp[] emp1 = new Emp[3];

		Emp e1 = new Emp(1001, "Viirat");
		Emp e2 = new Emp(1014, "Hardik");
		Emp e3 = new Emp(1112, "Canway");
		emp1[0] = e1;
		emp1[1] = e2;
		emp1[2] = e3;

		// System.out.println(emp1);

		for(Emp e : emp1)
			System.out.println(e.getId() + ":" + e.getName());

		Emp[] emp2 = new Emp[3];

		Emp e4 = new Emp(1001, "Viirat");
		Emp e5 = new Emp(1014, "Hardik");
		Emp e6 = new Emp(1112, "Canway");
		emp2[0] = e4;
		emp2[1] = e5;
		emp2[2] = e6;

		for(Emp e :emp2)
			System.out.println(e.getId() + ":" + e.getName());

		boolean res = Arrays.equals(emp1,emp2);
		System.out.println("res : " + res);
	}
}
} error