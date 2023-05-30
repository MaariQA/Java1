// call by value
package Method;
public class Method27 {
	public static void m1(int no) {
		no = 20;
		System.out.println("Math hc no"+System.identityHashCode(no));
	}
	public static void main(String[]args) {
		int i =10;
		System.out.println("main hc i"+System.identityHashCode(i));
		System.out.println("before calling m1 i="+i);
		m1(i);
		System.out.println("After calling m1="+i);
		System.out.println("Main hc i"+ System.identityHashCode(i));
	}
}
