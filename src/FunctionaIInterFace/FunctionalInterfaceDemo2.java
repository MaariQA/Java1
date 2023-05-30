package FunctionaIInterFace;

interface I2
{
	public void m1();
}

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		I2 obj = new I2()
		{
			public void m1()
			{
				System.out.println("Hello I am m1 method()");
			}
		};
		obj.m1();
	}
}
