package Day28May2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		/*
		 * unordered
		 * key value pair
		 * Duplicate key not allowed
		 * null key only once
		 * many null value- allowed
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(100,"Alia");
		map.put(400,"Deepika");
		map.put(100,"Anushka");
		map.put(100,"Puja");
		System.out.println(map);

		// using keyset
		Set<Integer> ks =  map.keySet();
		for(Integer x : ks) 
			System.out.println(x + " : " + map.get(x));

		for(Map.Entry<Integer, String> entry:map.entrySet()) {

			System.out.println(entry.getValue() + ":" + entry.getValue());
		}
	}
}