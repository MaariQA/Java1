// pass by value
package METHOD3;
public class Method14 {
	
	public static void main(String[] args) {
		int x = 0;
		int y = incrementValue(x);

		incrementValue(y);
	//	incrementValue(x);
		System.out.println(y);
		System.out.println(x);

	}
	static int incrementValue (int value) {
	//   value = value +1 ;
	//	value++;
	   return value+1;
	}
}
