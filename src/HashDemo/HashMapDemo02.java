package HashDemo;
// Demonstration of HashMap of String,String

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo02 {
	
	private static char[] Entry;

	public static void main(String[] args) {
		Map<String ,String> map = new HashMap<>();  

		// add value
		map.put("Virat", "Anushka");
		map.put("Dhoni", "Sakshi");
		map.put("Sachin", "Aniali");
		map.put("Virat", "Ritika");
		
		System.out.println(map);

		System.out.println(map.get("Dhoni"));  // Sakhshi
		System.out.println(map.get("dhoni"));  // null

		Set<String>	ks = map.keySet();
		Iterator<String> iter = ks.iterator();

		while(iter.hasNext())
		{
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("--------");
		
		for(Map.Entry<String, String> Entery : map.entrySet());
		// System.out.println(entry.getkey() + ":" + entry.getValue());

		System.out.println(Entry);

		System.out.println(map.size());
		//   map.clear();
		//   System.out.println(map.size());
		//   System.out.println(map);

		System.out.println("Is Rohit key present?" +map.containsKey("Rohit"));
		System.out.println("Is Rohit key present? "  +map.containsKey("rohit"));

		String val = map.remove("Rohit");
		System.out.println("val : " + val);
		System.out.println(map);

		Map<String,String> map1 = new HashMap<>();
		map1.put("Shikhar", "Ayesha");
		map1.put("Rahul", "Athia");
		map1.put("Rishanh", "Uevashi");
		map1.putAll(map1);
		System.out.println("map1 :" +  map1);

		System.out.println("map : " + map);
		map.replace("Shikhar", "SecondWife");
		System.out.println("map " + map);

		String v = map.putIfAbsent("Rohit", "Ritika");
		System.out.println("v : " + v);              // null if not present

		v = map.putIfAbsent("Rohit", "Ritika");
		System.out.println("V : " + v );            // IF PRESENT RETURN VALUE
	}
}
