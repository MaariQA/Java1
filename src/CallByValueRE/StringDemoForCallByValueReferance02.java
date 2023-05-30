package CallByValueRE;

public class StringDemoForCallByValueReferance02 {

	static void m1(String str)
	{
		str = str + " Mumbai";
		System.out.println("str : " + str);
	}
	public static void main(String[] args) 
	{
		String s1 ="Pune";
		m1(s1);
		System.out.println("s1 : " + s1);
	}
}