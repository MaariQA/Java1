package FunctionaIInterFace;

interface I5
{
	public void m1(int a, int b);
}

public class FunctionalInterfaceDemo5 {

	public static void main(String[] args) {

		I5 obj1 = (int a, int b) -> { System.out.println(a*b);};
		obj1.m1(2, 5);

		// OR
		I5 obj2 = (int a, int b) -> System.out.println(a*b);
		obj2.m1(10, 15);
	}
}