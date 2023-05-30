package ExceptionDemo;
// Demonstration of try- finally
// o/p: try - finally- exception(if any)

public class TryDemo {	
	public static void main(String[] args) {
		try {
			int[] arr = {10,20,30,40,50};
			System.out.println("length = "+arr.length);   // 5
			arr[11]= 60;         // 0 1 2 3 4
			System.out.println("I am after arr[11]= 60");
		}
		finally {
			System.out.println("I am  in finally");
			try {
				System.out.println("10/0");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("nested finally");
			}}}}