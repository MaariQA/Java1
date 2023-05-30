// copy Array
package Array;
public class ArrayCla13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,30,40};
		int[]b= new int [a.length];   // Printing original array
		System.out.println("Original Array Content");
		
		for (int i=0; i<a.length; i++)
		System.out.println(a[i]);
		// traditional for loop // copy from a to array
		
		for(int i=0; i<a.length;i++)
			b[i]=a[i];
		         // for each loop
		int i=0; 
		for(int x:a)
		b[i++]=x;
		System.out.println("Copide array content");
		           // printing copied array i.e b array
		for( i=0;i<b.length; i++);
		System.out.println(b[i]);
	}
}
