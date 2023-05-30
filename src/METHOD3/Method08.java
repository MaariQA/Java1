// Why do we need to pass variable to a method
// in order to understand and utilize value of variable defined outside of the method
package METHOD3;
public class Method08 {
	public static void main(String[] args) {
		
		int i = 1000 ;            // local 
		System.out.println(i);
		i = showivalue(i);
		System.out.println(i);
	}
	public static int showivalue (int k) {
		System.out.println("k="+k);
		k=10;
		System.out.println("k="+k);
		return k;
	}
}
