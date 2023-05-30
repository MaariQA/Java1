package ARRAY02;
public class ARRAY02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String [] a= {"VIrat","Rahual","Rohit","Dhoni"};
  System.out.println("Using traditional for loop");
  for(int i=0; i<a.length; i++)
  System.out.println(a[i]+" ");
  System.out.println("\n Using for each loop");
  for(String x:a)
  System.out.println(x+" ");
  
  // Using while loop
   System.out.println("\n Using while loop");
   int i=0;
   while (i<a.length);
   System.out.println(a[i++]+" ");
	
   // Using do while loop
   System.out.println("\n Using do while loop");
   i=0;
   do 
	   System.out.println(a[i++]+" ");
	   while (i<a.length);
   }}
