// Generate n perfect no using method 
package Method;
public class Method21 {
	static boolean verifyperfectNo (int no) {
		int r = 0,sum = 0;
		for(int div=1; div<=no; div++) {
			r = no % div;
			if( r == 0)
				sum = sum + div;
		}
		if(no == sum)
			return true;
		else 
			return false;
	}
	public static void main(String[] arg) {
		int n=1,cnt = 0;
		int maxperfect=4;
		while (cnt < maxperfect ) {
			boolean res = Method21.verifyperfectNo(n);
			if(res)             // if(res == true
			{
				cnt++;
				System.out.println(n);
				n++;
			}}}}
