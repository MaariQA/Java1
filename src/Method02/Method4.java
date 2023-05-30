// AddMethod
package Method02;
public class Method4 {
	public static  int add ( int ...arr) {    
		int sum = 0;
		for(int x:arr) {      
		sum = sum + x;
		}
		return sum;
	}
		public static void main(String[]args) {
			int a = 10;
			int b = 20;
			int res = add(a,b);
			System.out.println("ress"+res);
			
			res = add(a,b,30);
			System.out.println("res"+res);
			
			res = add(a,b,30,40);
			System.out.println("res"+res);
		}
}