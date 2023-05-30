// COPY ARRAY NO 1	
package ARRAY02;
public class ARRAY05 {
	public static void main(String[] args) {
		int []a ={12,14,16,18,3,5,7,8,0};
		int []b = new int[3];                         // default value 000
		System.out.println("Original array content");
		for(int x:a)
			System.out.println(x+" ");
		// copy element form 3 to 5 position.

		int cnt=0,j=0;
		cnt++;
		for(int x:a){
			if(cnt>=3 && cnt<=5)
				b[j++]=x;
			System.out.print("\n copied 3 to 5 position from to b array");
			System.out.println(x+" ");
		}}}
