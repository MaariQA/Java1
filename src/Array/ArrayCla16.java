// occurred no element
package Array;
public class ArrayCla16 {
	public static void main(String[] args) {
		int [] arr= { 12,56,34,56,12,56};
		for(int i=0; i<arr.length; i++) {
			int no = arr[i], cnt=1;
			if (no==-1)
				continue;
			for(int j=i+1; j<arr.length; j++) {
				if (no!=-1)
					if(no==arr[j]) {
						cnt++;
						arr[j]=-1;
					}
			}
			System.out.println(no+" has occurred "+cnt+" time");
		}
	}
}


