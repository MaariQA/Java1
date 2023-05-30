package ExceptionDemo;
// Demonstration of multiple try catch finally blocks

public class MultiTryCatch {
	public static void main(String[] args) {
		System.out.println("start of the program");

		try {
			int[] arr = {10,20,30,40,50,};
			System.out.println("length = "+arr.length);  // 5
			arr[11] = 60;   // 0 1 2 3 4
			System.out.println("I am after arr[11]= 60");
		}
		catch (ArrayIndexOutOfBoundsException cyber) {
			System.out.println("ArrayIndexOutOfBoundsException occurred");

			System.out.println(cyber.getMessage());
			cyber.printStackTrace();

		}catch (Exception e) {
			System.out.println();
			e.getMessage();
			e.printStackTrace();

		}finally {
			System.out.println("I am finally block#1");
		}
		// another try 

		try {
			System.out.println("I am inside Arithetic block");
			System.out.println("10/0");
			System.out.println("I am after /0");
		}
		catch ( ArithmeticException e) {
			System.out.println("Arithetic exception occurred ,you tried to divide by 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am finally block#2");
		}
		System.out.println("End of the program");
	}
}
