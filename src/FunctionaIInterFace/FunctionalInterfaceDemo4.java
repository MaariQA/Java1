package FunctionaIInterFace;

interface I4
{
	public void m1(int a);
}

public class FunctionalInterfaceDemo4 {

	public static void main(String[] args) {

		I4 obj = (int n) -> { System.out.println(n*n);};
		obj.m1(10);     // 100

		// OR more reduced code
		I4 obj1 = (int n) -> System.out.println(n*n);
		obj1.m1(20);    //400
	}
}
