// Generate n prime no using method
package Method;
public class Method26 {
	static boolean isNoprime (int no) {
		
		return true;
	}
		public static void main(String[]arg) {
			int no =1; int  maxPrimeNo =50; int Primecounter = 0;
			System.out.println("Below are "+maxPrimeNo+"prime no");
		
			while ( Primecounter < maxPrimeNo) {
				boolean res = isNoprime(no);
				if(res == true) {
					System.out.println(no);
					Primecounter ++;
				}
				no ++;
			}}}
