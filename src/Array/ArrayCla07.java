package Array;
public class ArrayCla07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		a[0]=12;
		a[1]= 3;
		a[2]= 5;
		a[3]= 7;  
		a[4]=12;
		System.out.println("original Array Content:");

		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

		int min= -1000;
		for(int i=0;i<a.length; i++) {
			if(a[i]>min )
				min=a[i];
			System.out.println("Max value form an array is"+min);
		}
	}
}

