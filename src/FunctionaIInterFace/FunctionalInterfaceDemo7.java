package FunctionaIInterFace;

	interface I7
	{
		public int getLength(String str);
	}
	public class FunctionalInterfaceDemo7 {

		public static void main(String[] args) {

			I7 obj1 = str -> str.length();
			System.out.println(obj1.getLength("Rohit Sharma"));

			I7 obj2 = (str) -> {return str.length();};
			System.out.println(obj2.getLength("Rohit Sharma"));
		}
	}
