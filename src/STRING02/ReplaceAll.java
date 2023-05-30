package STRING02;
public class ReplaceAll {
	public static void main(String[] args) {
		// Initializing String
		String Str = new String("Welcome to cyber success");

		// Using replace to replace characters
		System.out.print("After replacing all o with r : ");
		System.out.println(Str.replace('o', 'r'));

		// Using replace to replace characters
		System.out.print("After replacing all e with D : ");
		System.out.println(Str.replace('e', 'D'));
		
		// Using replaceFirst to replace regex with
        // replace_str Replaces 1st occurrence of success with plaza.
        System.out.print("After replacing 1st occurrence of regex with replace_str : ");
        System.out.println(Str.replaceFirst("success", "plaza"));
    }
	}

