package Day28May2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfHashMap {
	public static void main(String[] args) {
		List<HashMap<String,String>> lhm = new ArrayList<>();

		HashMap<String, String> m1 = new HashMap<>();
		m1.put("iod", "100");
		m1.put("name", "AAA");

		HashMap<String, String> m2 = new HashMap<>();
		m2.put("id", "200");
		m2.put("name", "BBB");

		HashMap<String, String> m3 = new HashMap<>();
		m3.put("id", "300");
		m3.put("name", "CCC");

		HashMap<String, String> m4 = new HashMap<>();
		m4.put("id", "400");
		m4.put("name", "DDD");

		lhm.add(m1);
		lhm.add(m2);
		lhm.add(m3);
		lhm.add(m4);
		for(int i=0; i<lhm.size(); i++)
		System.out.println(lhm.get(i).get("id")+ " : " + lhm.get(i).get("name"));
	}
}