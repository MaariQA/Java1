// perfect no is using method given
package Method;
public class Method20 {
	static boolean verifyperfectNo(int no) {
		int r =0, sum = 0;
		for(int div=1; div<=no; div++) {
			r = no % div;
			if(r==0);
			sum = sum + div;
		}
		if(no == sum)
			return true;
		else 
			return false ;
	}
	public static void main(String[] args) {
		int n = 496;
		boolean res = verifyperfectNo(n);
		if(res)                           //  if (res == true)
			System.out.println(n+"is a perfect no");
		else 
			System.out.println(n+"is a not a perfect");
	}
}
