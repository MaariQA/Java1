package HashDemo;
// Demonstration of Hashmap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();  // 16 buckets 0.75
		// unorder
		// key - unique
		// value - can be duplicate

		map.put(101, "Virat");
		map.put(102, "Shikhar");
		map.put(110, "Rohi");
		map.put(104, "Virat");
		map.put(null, null);
	    map.put(null, "Kapil");
		map.put(101, "Virat Kohli");
		System.out.println(map);

		 String v1 = map.get(110);
		 System.out.println(v1);
		 
	// way#1 to access hashmap
		 
		 Set<Integer> ks = map.keySet();
		 Iterator<Integer> iter =ks.iterator();
		 while(iter.hasNext())
		 {
			 Integer k = iter.next();
			 String v =map.get(k);
			 System.out.println(k +":" +v);
		 }
		 System.out.println("-----------");
		 // way#2
		 for(Entry<Integer, String> entry : map.entrySet())
			 System.out.println(entry.getKey() + ":" +entry.getValue());
		 }		 
}
