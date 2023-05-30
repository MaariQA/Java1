// AddMethod
package Method02;
public class Method5 {
	public static  int add ( int y, int ...arr) {   
		int sum = 0;
		for(int x:arr) {      
			sum = sum + x;
		}
		return sum = y ;
	}
	public static void main(String[]args) {
		int res = add (50,10,20,30,40);
		System.out.println("ress"+res);
	}
}
