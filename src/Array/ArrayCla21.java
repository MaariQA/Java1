package Array;
public class ArrayCla21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr= {
				  {"Virat","Rohit"},{"Shikhar","Sachin"},{"Rahual","Dhoni"}};
       System.out.println(arr.length);
       System.out.println(arr[0].length);
       
       for(String[]x:arr) {
       for(String y:x) 
      	 System.out.print(y="\t");
      	 System.out.println();
       }}}
       
