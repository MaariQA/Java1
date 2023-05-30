package forloop;
public class PrimeNO {
	public static void main(String[] args) {
		int no=19, i;
		for( i=2; i<=no/2; i++)
		{                                 //  i<=12/2
	       int r;
			r=no%i ;
			if(r==0) {
				System.out.println("Factor:"+i);
				break;
			}
		}
			
			 if(i==(no/2)+1) 
			System.out.println(no+"is a prime no");
		else 
			System.out.println(no+" is not a prime no");
	}}

