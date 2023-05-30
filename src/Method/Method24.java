// find the given no is prime
package Method;
public class Method24 {
	public static void main(String[] args) {
		int no =24,r=0;
		int	inLoop=0;
		for( int div=2;div<no; div++) {

			r = no% div;
			if(r == 0) {
				inLoop = 1 ;
						System.out.println(no+"is not prime");
				break ;
			}}
		if( inLoop== 0)
			System.out.println(no+"is not prime");
	}
}

