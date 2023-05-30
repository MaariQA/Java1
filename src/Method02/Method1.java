// call by referanceDemo {
package Method02;
public class Method1 {
	public static void  changeArray(int[]b) {
		b[0]=5;
		b[1]=10;
		b[2]=15;
	}
	public static void main (String[]args) {
		int[]a= {10,20,30};
		System.out.println("Befor calling method");
		for (int i=0; i< a.length; i++) {
			System.out.println(a[i]);
			System.out.println("-------");
		//	changeArray(a);
			System.out.println("After calling method");
			for(int j=0; j<a.length;j++) {
				System.out.println(a[i]);
			}
		}
	}}
