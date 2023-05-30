package ExceptionDemo;
// Demonstration of throwing an exception-  builtin

public class ThrowsDemo01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("I am the first statement");
		Thread.sleep(10001);
		int price = 0;
		if(price == 0)
		throw new RuntimeException("I am the boss want to stop the execution !!");

		System.out.println("I am the second statement");
		Thread.sleep(10001);

		System.out.println("I am the last statement");
		throw new RuntimeException("Raising new exception");
	}
}
