// check the given no is a perfect no or not
package Method;
public class Method19 {
	public static void main(String[] args) {
		int n = 28,r = 0, sum = 0;
		for( int div=1; div<n; div++) {
			r=n%div;
			if(r==0) {             // sopln (div);
				sum=sum+div;
			}}
		if(n==sum)
			System.out.println(n+"is a perfect no");
		else {
			System.out.println(n+"is a not a perfect no");
		}
	}
}