package CallByValueRE;

public class StringDemoForCallByValueReferance03 {

		static String m1(String str)
		{
			str = str + " Mumbai";
			System.out.println("str : " + str);
			return str;
		}
		
		public static void main(String[] args) 
		{
			String s1 = "Pune";
			m1(s1);
			System.out.println("s1 : " + s1);
		}
	}

