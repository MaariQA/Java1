package STRING;
public class StringDemo03 {
	public static void main(String[] args) {
	    String name = "MAARI";
		String name1 = "Maari";
    System.out.println(name);
    int  value = name.length ();
    System.out.println(value);
    
    String string = name.toLowerCase();
    System.out.println(string);
    
   String string2 = name.toUpperCase();
   System.out.println(string2);
   
   name.trim ();
   String nonTrimmedstring = "   Marri  ";
   System.out.println(nonTrimmedstring.trim());
   
//   name.trim ();
//   String nonTrimmedstring1 = "   Marri  ";
//   String trimedstring ;
//   System.out.println(nonTrimmedstring.trim());
//   System.out.println(trimedstring());

	}
}

