// format of
package STRING02;
public class ForamtOf {
	public static void main(String[] args) {
       // int i = 2;
      //  double r = Math.sqrt(i);
       // System.out.format("The square root of %d is %f.%n", i, r);
		
		
	   String s = "Mayur";
     //   System.out.format(String.format("%20s","Mayur"));
       System.out.println(String.format("%-20s", s));

        System.out.println(String.format("%-20s", "Mayur"));
        System.out.println(String.format("%-5d",102));
        System.out.println(String.format("%-5d",12));
        System.out.println(String.format("%-5d",1));
        System.out.println(String.format("%-5d",2));
        
        System.out.println(String.format("%-7.2f",2498.12));
        System.out.println(String.format("%-7.2f",168.98));
        System.out.println(String.format("%-7.2f",2.4));
        
        System.out.println(String.format("%-7.2f",2.5));
        System.out.println(String.format("%-7.2f",2.458));
        System.out.println(String.format("%-7.2f",2.454));
        System.out.println(String.format("%-7.2f",123142.486865));
	}}

//format is static method.
//This function is taken two parameter .one conversion.
//Specification letter and other one is String / number '+', or '-'
//sing determined left / right justification
//D = stands for integer value
//F = stands for float value.
//S = stands for string value.
//d formats an integer value as a decimal value.
//n outputs a platform-specific line terminator.
//x formats an integer as a hexadecimal value.
//tB formats an integer as a locale-specific month name.
//conversion specification should start with % sing
// System.out.println("String.format("%-30","Mayur Mandhar")
// within 30 char contain 2nd parameter has to be insert,30- length
// of 2nd parameter would print as space