package FunctionaIInterFace01;

	// IS a given EVEN or not with regular method?

	interface I1
	{
		public boolean test(int a);
	}
	class A implements I1
	{
		@Override
		public boolean test(int n)
		{
			return n%2 == 0;
		}

		//public class findingEvenNoDemoSIMPLE{

		public static void main(String[]args) {

			// we are crating an object of I1 interface but we can not create an
			// object of interface so it is an Example of top-casting/ up-casting
			// polygraphic reference/ polymorphic reference where a reference variable 
			// will be able to access all instance variables and method from interface I1 
			// and all overridden methods from child class.
			// Here we are creating an object of a child class of typeInterfacew I1
			I1 obj = new A();
			//or
			A obj1 = new A();
			System.out.println("obj.test(20):" +obj.test(20));  // true

			System.out.println("obj.test(20):" +obj1.test(21));  //  false
		}
	}
	// error main main method

