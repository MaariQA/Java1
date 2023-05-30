package ARRAY02;
public class ARRAY03 {
	public static void main(String[] args) {
		int[] a= {12,14,16,18,1,3,5,7,9,0};
		int[] b= new int [3];                   // default value
		System.out.println(" Originasl array content");
		for(int x:a)
		System.out.println(x+" ");
		int j=0;  
		for( int i=2; i<=4;i++)
		b[j++]=a[i];
		System.out.println("\n\n Copied 3 rd to 5 position from a to b array");
		for(int x:b)   // 0 1 2
		System.out.println(x+" ");
		
	}
}
