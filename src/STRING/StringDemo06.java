package STRING;
public class StringDemo06 {
	public static void main(String[] args) {
		String username = "Admi"; 
		String password = "Ad123";

		String dbUsername = new String("admin");
		String dbPassword = new String("admin@ad123");
		// == checks the address or reference

		if(username == dbUsername && password == dbPassword ) {
			System.out.println("authenticsted");
		}else {
			System.out.println("invalid creds");
		}
		
		// to check the content we user equals method
		if(username.equals(dbUsername)&& password.equals(dbPassword)) {
			System.out.println("authenticsted");
		}else {
			System.out.println("invalid creds");
		}
		
		// to check the content without considering the class we use equalsIgonreCase method
		if(username.equalsIgnoreCase(dbUsername)&& password.equalsIgnoreCase(dbPassword)) {
			System.out.println("authenticsted");
		}else {
			System.out.println("invalid creds");
		}
	}
}