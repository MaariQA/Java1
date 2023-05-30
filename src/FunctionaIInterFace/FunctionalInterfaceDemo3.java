package FunctionaIInterFace;

interface I3
{
	public void m1();
}

public class FunctionalInterfaceDemo3 {

	public static void main(String[] args) {

		I3 obj = () -> { System.out.println("Hello");};
		obj.m1(); //

		// OR more reduced code

		I3 obj1 = () -> System.out.println("Hi");;
		obj1.m1();
	}
}
