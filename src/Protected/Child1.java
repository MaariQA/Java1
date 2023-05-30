package Protected;

public class Child1 extends Parent1 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.age = 100;
		System.out.println(c1.age);
		c1.disp();
	}
}