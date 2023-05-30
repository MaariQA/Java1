package Collection02;
// Demonstration of a treemap

import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {

		// Creting a hashmap of default bucket size of 10 and loadfactor of 50%
		// Map<Integer,String> map = new HashMap<> (10, 0,50f);

		// treeset always maintains ascending order of key
		// ordered asc by default
		Map<Integer,String> map = new TreeMap<>();
		map.put(101, "Chandu");
		map.put(101, "Siddesh");
		map.put(101, "Prasad");
		map.put(101, "Prakash");
		map.put(101, "Aakash");
		map.put(101, "Rajendra");

		// tree set does not allow null inside a key
		// map.put(null,"Virat");

		map.put(500, null);
		map.put(400, null);
		System.out.println(map);
	}
    }