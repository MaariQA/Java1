package Collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseEveryElementInAL {

	public static void main(String[] args) {
		List<String> al = new ArrayList() {
			{
				add("Virat");  // tariv
				add("Rohit");  // tihoR
				add("Virat");
				add("Shikhar");
				add("Rohit");
				add("Rohit");
			}
		};
		for(String s: al)
		{
			System.out.println(s + " : ");
			// reverse
			String revStr = "";
			for(int i=s.length()-1;i>=0;i--)
				revStr = revStr + s.charAt(i);
			System.out.println(revStr);
		}}}
