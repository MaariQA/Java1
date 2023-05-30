package ExceptionDemo;
// Demonstration try- catch-block
public class TryCatchBlock {

	public static void main(String[] args) {
		System.out.println("Strat of the program");
		try {
			int[] arr = {10,20,30,40,50};
			System.out.println("length = "+arr.length);   // 5
			arr[11]= 60;         // 0 1 2 3 4
			System.out.println("I am after arr[11]= 60");
			System.out.println("10/10");
			System.out.println("I am after /0");
		}
		catch (ArrayIndexOutOfBoundsException cyber) {
			System.out.println("ArrayIndexOutOfBoundsException occuured!!!");
			cyber.printStackTrace();
		}

		catch (ArithmeticException e) {
			System.out.println("Arthmetic exception occurred , you tried to divide by 0");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception occurred !!!");
			e.printStackTrace();
		}
		finally {
			System.out.println(" I am in finally block");
		}
		System.out.println("End of the program");
	}
}
