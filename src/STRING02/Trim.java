// Trim  // strip
// this is function or method remove leading and trailing with space('BLANK SPACE')
package STRING02;
public class Trim {
	public static void main(String[] args) {
		String str = "     I am learin java         ";
		System.out.println("str:"+str.trim());
		System.out.println("str:"+str.length());
		
		String str1 = "     I am learin java          i love java    ";
		System.out.println("str1:"+str1.trim());

	}
}
