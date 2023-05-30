package Collection02;

public class WrapperClassDemo {

	public static void main(String[] args) {

		// valueOf -> Converts string into respective non primitive data type

		Integer obj = Integer.valueOf("100");

		System.out.println(obj); // 100

		System.out.println(obj + 123); // 223

		System.out.println(Integer.BYTES);

		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);

		Boolean obj1 = Boolean.valueOf("true");

		System.out.println("obj1 : " + obj1);

		Boolean obj2 = Boolean.valueOf("false");

		System.out.println("obj2 : " + obj2);

		Boolean obj3 = Boolean.valueOf("chandu"); // not a true or false => false

		System.out.println("obj3 : " + obj3);

		Float flObj = Float.valueOf("49.0f");

		System.out.println("flObj :"+ flObj);

		Float flw = new Float(49.0f);

		// deprecated function : koma

		// Obsolete function : Expired

		System.out.println(flw);

		// To convert float object into int value (primitve data type)

		int floatToInt = flw.intValue(); // 49

		System.out.println(floatToInt);

		// number system

		// binary - 0,1 -> base 2

		// octal - 0,1,2,3,4,5,6,7 -> base 8

		// decimal - 0,1,2,3,4,5,6,7,8,9 -> base 10

		// hexdecimal - 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F -> BASE 16

		Integer sevenDecimalValue = Integer.valueOf("111", 2); // 7 binary to integer

		System.out.println(sevenDecimalValue); // 7

		// Autoboxing

		int a = 20;

		// converting int into Integer explicitely

		Integer i = Integer.valueOf(a);

		System.out.println("i =>"+ i);

		// AutoUnboxing

		Integer ab = new Integer(10);

		// converting Integer to int explicitly

		int ib = ab.intValue();

		System.out.println("ib => " + ib);

		// another way to convert object into primitive data type

		int j=i;

		System.out.println("j = " + j);

		// object has got associated methods so i object will have methods by calling

		}
}