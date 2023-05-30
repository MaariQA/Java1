// String variable length Demo
package METHOD3;
public class Method13 {
/*	public  class StringvaeiableLengthDem {
		public static void main(String[] args) {
		System.out.println("fn:"+getfullName("cyber","success"));
			
		System.out.println("fn:"+getfulName("cyber","success"."PVT Ltd"));
			
		String String s= getfullName("cyber","success","pune","solution","Mah","414001");

  System.out.println("fn:"+s);
		}
		static String getfulName(String...a) {
			String str = "";
			for(String x:a) 
				str str+" "+x;
				return str;
		}
	}}
// Variable are can be any type when you want to pass arguments.
// Which are not constant in number,then we have make use of variable argument.
// int...defines an array of int.
// String ...defines an array of string.

/*/
    public static void main(String[] args) {
        System.out.println("fn:" + getfullName("cyber", "success"));
        System.out.println("fn:" + getfullName("cyber", "success", "PVT Ltd"));
        String s = getfullName("cyber", "success", "pune", "solution", "Mah", "414001");
        System.out.println("fn:" + s);
    }
    static String getfullName(String... a) {
        String str = "";
        for (String x : a) {
            str = str + " " + x;
        }
        return str;
    }
}
