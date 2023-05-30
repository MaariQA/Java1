// strip() strip method can trim or removes leasing or trailing or both space
// this function is introduces in java 11
// 3 format of strip = strip(), String leading,Sting Trailing();
// String Class stripLeading() method is used to strip leading 
// white spaces from the string i.e stripLeading() method removes all the
// white spaces only at the starting of the string. 

package STRING02;
public class Strip {
	public static void main(String[] args) {
		String str= "     My Country name is India     !     ";

		// removing leading and  
		// trailing white spaces
		System.out.println(str.strip());       // My Country name is India     !              

		// removing leading white spaces
		System.out.println(str.stripLeading());   // My Country name is India     !              


		// removing trailing white spaces
		System.out.println(str.stripTrailing());  // "----- My Country name is India     
  
	}
}

// Java Program to demonstrate the use of the strip()
// method,stripLeading() method,stripTrailing() method


		