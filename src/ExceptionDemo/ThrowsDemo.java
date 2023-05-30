package ExceptionDemo;

public class ThrowsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("I am the first statement");

		Thread.sleep(10001);

		System.out.println("I am the second statement");
		Thread.sleep(10001);

		System.out.println("I am the last statement");
	}
}

