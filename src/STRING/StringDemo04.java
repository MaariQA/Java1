package STRING;
public class StringDemo04 {
	public static void main(String[] args) {                 // maari
	//	String name = "Ma";
		String name = "Maari";
	//	System.out.println(name.substring(1,4));
	//	System.out.println(name.substring(1));
	
		name.replace('r','p');
		System.out.println(name.replace('r','p'));
		
		name.startsWith("ka");
		System.out.println(name.startsWith("Maari"));
		System.out.println(name.startsWith("Ha"));
		
		name.charAt(0);
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		
		name.indexOf(2);
	}
}
 