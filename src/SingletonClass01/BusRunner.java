package SingletonClass01;

public class BusRunner {

	public static void main(String[] args) {
		Bus obj1 = Bus.getInstance();
		Bus obj2 = Bus.getInstance();
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));

		Bus obj3 = Bus .getInstance();
		System.out.println(System.identityHashCode(obj3));
	}
}
