// DUPLICATE ARRAY
package ARRAY02;
public class ARRAY17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,10,10,30,30};
		boolean found = false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++)
				if(arr[i]== arr[j] && i!=j) {
					found=true; 
					break;
				}
			if(found = true) {
				break ;
			}}
		System.out.println(found? "found":"not found");
	}
}