package Array;
public class Array04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {154,153,178,55,34,9,1,7553,87};
		int rem ,sum=0,no ;
		for( int i=0;i<arr.length;i++) {
			sum=0;
			no=arr[i];
			while(no>0) { 
				rem =no%10 ;
			sum=sum+(rem*rem*rem);
			no=no/10;
			if(arr[i]==sum)
				System.out.println(arr[i]+" is ARM no");
		}}}}
