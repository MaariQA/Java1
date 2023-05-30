package SingletonClass01;
 // demonstration of  ENUM
public class Runner {
	static void m1 (BROWSER br) 
	{
		System.out.println(br);;
		if(br.toString().equals("CHROME"))
		System.out.println("************");
		else if(br.toString().equals("EDGE"))
		System.out.println("+++++++++++++++");
		else if ( br.toString().equals("FIREFOX"))
		System.out.println("====================");
		else if( br.toString().equals("SAFARI"))
		System.out.println("^^^^^^^^^^^^^^^^^^");
	}
		public static void main(String[] args) {
			m1 (BROWSER.SAFARI);
		}}
			
		
	


