// find the a given prime no
package Method;
public class Method23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int no = 12, r = 0;
 boolean flag = true ;
 for( int  div=2;div<no;div++) {
	 r = no % div;
	 if( r == 0) {
	 flag = false;
	 System.out.println(no+"is a not a prime");
	 break ;
	 }}
 if(flag == true)
	 System.out.println(no +"id not a prime");
	}
}
 
