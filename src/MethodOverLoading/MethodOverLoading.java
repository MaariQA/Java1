package MethodOverLoading;
// main method can be overloaded and can be called within the same name code
public class MethodOverLoading{
	public static void main(int a) {
		System.out.println("a = "+a);
	}
	public static void main (String str)
	{
		System.out.println("str ="+ str);
	}
	public static void main(String str1,String str2,int a)
	{
		System.out.println("str1+str2+a=" +str1+str2+a);
	}
     public static void main (String[]args) {
    	 System.out.println("Hello");
    	 
    	 main(100);
    	 main("pune");
    	 main("mumbai","pune",200);
	}
}