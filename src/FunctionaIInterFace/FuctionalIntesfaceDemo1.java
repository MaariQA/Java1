package FunctionaIInterFace;

interface I1
{
	public void m1();
}
class A implements I1
{
	public void m1()
	{
		System.out.println("I am m1 method....");
	}
	public class FunctionalInterfaceDemo1 {

		public static void main(String[] args) {

			I1 obj = new A(); // top casting/runtime polymorphism

			obj.m1();
		}
	}
}



