package TypeCasting;

public class TypeCastingDemo01 {

	public static void main(String[] args) {
		byte b = 20;                // 1 byte
		int a = 1000000000;        // 4 bytes

		// a + b;
		// System.out.println(a + " : " + b);

		b=(byte) a;
		System.out.println(a + " : " + b);

		float f=1.23f;              // 4 bytes
		int i=10;                  // 4 bytes

		// i = (int) f;
		// System.out.println("i : " + i);

		f=i;
		System.out.println("f : " + f);

		// top casting - up casting
		// child -> Parent
		// ParentClass Obj = new ChildClass
	}
}