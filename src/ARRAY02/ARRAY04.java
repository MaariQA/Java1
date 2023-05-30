// addition of 2 matrix
package ARRAY02;
public class ARRAY04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,20},{30,40}};
		int[][] b= {{12,15},{17,18}};
		int[][] res= new int[a.length] [a[0].length];
		for(int r=0; r<a[0].length; r++) 
		for(int c=0; c<a[0].length; c++) {
				res [r][c]	=a[r][c]+ b[r][c];
	}
		for(int r=0; r<a.length; r++) 
			for(int c=0; c<a[0].length; c++) 
			System.out.println(res[r][c]+"\t");
			System.out.println();
}
}
