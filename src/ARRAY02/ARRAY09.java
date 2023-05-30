// command line  argument passing while running a java code
package ARRAY02;
public class ARRAY09 {
	public static void main(String[] args) {
 for( String x:args) 
// System.out.println(x+" ");
 System.out.println(args[0]+" "+args[1]+" "+args[2]);
 int res;
 res = Integer.valueOf(args[0])+Integer.valueOf(args[1]);
  System.out.println("res="+res);
	}
}
