// Demonstration of 3D Array
package ARRAY02;

public class ARRAY20 {
	public static void main(String[] args) {
		int [][][] a = {      // 2,3,4
				{ 
					{1,2,3,4,},
					{5,6,7,8,},
					{9,10,11,12,}
				},
				{
					{11,12,13,14},
					{15,16,17,18,},
					{19,20,21,22,}
				}
		};
		// printing address - hashcode

		System.out.println(a);
		System.out.println(a.toString());

		System.out.println(a.length);        // 2
		System.out.println(a[0].length);     // 3
		System.out.println(a[0][0].length);  // 4

		for(int i=0; i<a.length;i++) {
		for(int j=0; j<a[0].length; j++) {
		for(int k=0; k<a[0][0].length; k++) {
		System.out.print(a[i][j][k]+"\t");
		System.out.println();
	}
		System.out.println();
	}}}}



