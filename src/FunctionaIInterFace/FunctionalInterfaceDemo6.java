package FunctionaIInterFace;

	interface I6
	{
		public void m1(String fName, String lName);
	}

	public class FunctionalInterfaceDemo6 {

		public static void main(String[] args) {

	/*  
	  I6 obj = (String a, String b) -> { System.out.println(a + " " + b);};
 
	obj.m1("Virat","Kohli");
    */
			
    /*	
    I6 obj = (a,b) -> { System.out.println(a+" " + b);};

	obj.m1("Virat","kohli");
	
	*/
			// can find length of a name

			I6 obj = (a,b) -> System.out.println(a.length()+b.length());
			obj.m1("Virat","Kohli");
		}
	}