package ARRAY02;
public class ARRAY07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char[][] cha= {{'c','y','b','e','r'},{'s','u','c','c','e','s','s'}};
		 System.out.println("Row length "+cha.length);  // 2
		 System.out.println("col length" +cha[0].length); 
		 System.out.println("col length" +cha[1].length);
		 
		 for(int r=1; r<cha.length;     r++)
		 for(int c=0; c<=cha[r].length; c++)
		 System.out.println(cha[r][c]+"\n");
		 System.out.println();
  }
}
