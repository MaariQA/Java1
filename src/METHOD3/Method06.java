// GreetHumanMethod
package METHOD3;
public class Method06 {
	public static String greetName (String n,String sn,int age){ // Formal parameter 

		System.out.println("2");
		String S = "Hellow"+n+ " " + sn+"("+age+"),wishing you a great day ahead " ;
		System.out.println("3");
		return sn;
	}
	public static void main(String[]args) {
		System.out.println("1");
		String name = "Swapnil" ;                   // local variable to a main method
		String surname = "Maari" ;
		int age  = 18;
		String str = greetName(name,surname,age) ; // argument(actual);
		System.out.println("str");
	}
}

