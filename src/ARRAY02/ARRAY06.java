// Equal both array
package ARRAY02;
public class ARRAY06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,20},{30,40}};
		int[][] b= {{12,15},{17,18}};
if((a.length == b.length)&&(a[0].length == b[0].length)&&(a[1].length == b[1].length)) {
			boolean flag  = true;
			for(int r=0;r<a.length; r++) {
				for(int c=0;c<a[0].length; c++) {
					if(a[r][c]!= b [r][c]) {
						flag =false;
						break;
					}}}
			if(flag) 
				System.out.println("Both matrix are same");
			else 
				System.out.println("Both matrix are not same");  
		}else 
			System.out.println("Matrix comparision is not possible");
	}
}

	
