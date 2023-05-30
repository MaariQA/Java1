package Inheritance2;

public class StringParameterPassingDemo3 {
	
	static void m1(char[] str1)
	{
		str1[0] = 'P';
		str1[0] = 'U';
		str1[0] = 'N';
		str1[0] = 'E';
		str1[0] = 'A';
		str1[0] = 'B';
		str1[0] = 'C';
		System.out.println("inside m1()=>");
		for (char ch: str1)
			System.out.println(ch);
	}
	public static void main(String[] args) {
			char[] str= {'P','U','N','E',',',','};
					m1(str);
			System.out.println("inside main()=>");
			System.out.println("str =" + str);
			for(char ch: str)
				System.out.println(ch);
			}
		}
	


