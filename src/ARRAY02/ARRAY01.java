package ARRAY02;
public class ARRAY01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][]a= {{100,200,300},
    		{4,3,2},
    		{-10,-20,-30},
    		{6,22,9}};
    System.out.println("a[0])[0]=>"+a[0][0]);  // 100
    System.out.println("a[2][0]=>"+a[2][0]);   //-10
  	System.out.println("a[2][2]=>"+a[2][2]);   //-30
   	System.out.println("a[1][1]=>"+a[1][1]);   //3
    System.out.println("a.length=>"+a.length);
  // Total no of row in a 2 D array= 4
    
    System.out.println("a[0].length=>"+ a[0].length);
 // Total no of row in a 2 D array = 3
    
    System.out.println("a[1].length=>"+ a[1].length);
 // Total no of row in a 2 D array = 3

    System.out.println("a[2].length=>"+ a[2].length);
// Total no of row in a 2 D array = 3

    System.out.println("a[3].length=>"+ a[3].length);
 // Total no of row in a 2 D array = 3

    System.out.println("\n Printing all element from an 2 D arrray");
     for (int i=0;i<a.length; i++)
     for (int j=0;j<a[i].length; j++)
     System.err.println(a[i][j]+"\n");
    System.out.println();
	}
}
