// ArrayReversMethod
package METHOD3;
public class Method04 {
	public static int[] CopyArr(int[]b){
		int[]c = new int[b.length];
		for(int i=b.length-1;i>=0; i--) { 
			c[b.length - 1 - i] = b[i];   	  //		[cnt ++] =  b[i];
		}
		return c;
	}
	public static void main ( String[]args) {
		int[] arr ={45,23, 67,89,21};
		int[]arrcopy=CopyArr(arr);
		for (int x:arrcopy){
			System.out.println(x+" ");
		}
	}
}
