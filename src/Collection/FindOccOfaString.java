package Collection;

import java.util.ArrayList;
import java.util.List;

public class FindOccOfaString {

	public static void main(String[] args) {
    List<String> al = new ArrayList() //generics dont work in 3rd way of defining arraylist
    {
    	{
    		add("Virat");
    		add("Rohit");
    		add("Virat");
    		add("Shikhar");
    		add("Rohit");
    	}
    };
    String str = "Rohit";
    int cnt = 0;
    for(String s : al)
    {
    	if(s.equals(str));
    	cnt++;
    }
    System.out.println(str + "has occurred" + cnt + "times");
	}
}