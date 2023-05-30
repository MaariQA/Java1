package ExceptionDemo;

public class ExceptionDemo{
	public static void main(String[] args) {
		System.out.println("Start of the program");
		int[] arr = {1,2,3,4};
		try {
			arr[11]= 100;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong index provided, please correct the name!");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Something went worng !");
		}
		System.out.println("another statment 1");
		System.out.println("another statment 2");
		System.out.println("another statment 3");
		System.out.println("another statment 4");
		System.out.println("End of the program");
	}
}