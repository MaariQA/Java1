package Method;
public class Method05 {
	// This is a static method named "greet" that takes a String argument "n"
	public static void greet (String n) {
		System.out.println("Hellow" + " " + n);
	}
	public static void main(String[] arg) {
	String name = "Maari";
	// Here, we are calling the "greet" method and passing the "name" variable as an argument
	greet(name);
}}