package CallByValueRE;

public class StringDemoForCallByValueReferance01 {

	static void m1(String str) 
	{
		str = "Mumbai";
		System.out.println("str : " + str);
	}
	
	public static void main(String[] args) {
		
        // String s1 = new String("Pune");

		String s1 = "Pune";
		m1(s1);
		System.out.println("s1 : " + s1);
	}
}