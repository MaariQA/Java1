package Array;
public class ArrayCla20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int [4][3];
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		// System.out.println(arr[4].length);  // array bound of exception

		System.out.println(arr[0][0]+ "\t" +arr[0][1]+ "\t" +arr[0][2]);
		System.out.println(arr[1][0]+ "\t" +arr[1][1]+ "\t" +arr[1][2]);
		System.out.println(arr[2][0]+ "\t" +arr[2][1]+ "\t" +arr[2][2]);
		System.out.println(arr[3][0]+ "\t" +arr[3][1]+ "\t" +arr[3][2]);

		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;

		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;

		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;

		arr[3][0]=100;
		arr[3][1]=110;
		arr[3][2]=120;
		System.out.println("=========");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+"\n");
			System.out.println();
		}
	}
}

