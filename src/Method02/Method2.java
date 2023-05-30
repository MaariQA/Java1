// call by refrenceDemo
package Method02;
public class Method2 {
	static void  printArray(int[]c) {
		for (int i=0; i< c.length; i++) {
			System.out.println(c[i]);
		}}
	static void changeArray(int[] b) {
		b[0]=5;
		b[1]=10;
		b[2]=15;
		System.out.println("After calling method");
		printArray(b);
	}
	public static void main (String[]args) {
		int[]a= {10,20,30};
		System.out.println("Befor calling method");
		printArray(a);
		System.out.println("-------");
		changeArray(a);
		//	printArray(a);

	}
}
