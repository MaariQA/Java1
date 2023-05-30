package Day28May2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListOfHashMapOfList {

	public static void main(String[] args) {
		List<Map<String, List<String>>> al = new ArrayList<>();
		// index 0 row

		List<String> IsId1 = List.of("1", "2", "3");
		List<String> IsName1 = List.of("AAA", "BBB", "CCC");

		Map<String, List<String>> ml1 = new HashMap<>();
		ml1.put("id", IsId1);
		ml1.put("name", IsName1);
		al.add(ml1);

		// index 1 row
		List<String> IsId2 = List.of("4", "5", "6", "7", "8");
		List<String> IsName2 = List.of("DDD", "EEE", "FFF", "GGG", "HHH");

		Map<String, List<String>> ml2 = new HashMap<>();
		ml2.put("id", IsId1);
		ml2.put("name", IsName1);
		al.add(ml2);

		// index 3 row
		List<String> IsId3 = List.of("4", "5");
		List<String> IsName3 = List.of("III", "JJJ");

		Map<String, List<String>> ml3 = new HashMap<>();
		ml2.put("id", IsId1);
		ml2.put("name", IsName1);

		al.add(ml3);

		// print enter list
		// System.out.println(al);
		// iterate list containing map and map contains key and is it <String>

		for (int i = 0; i < al.size(); i++) {
			Map<String, List<String>> map = al.get(i);
			List<String> IsId = map.get("id :");
			System.out.println("id: ");

			for (int j = 0; j < IsId.size(); j++)
				System.out.println(String.format("%3s", IsId.get(j)) + " ");

			System.out.println(" :  name : ");
			List<String> IsName = map.get("name: ");
			for (int j = 0; j < IsName.size(); j++)
				System.out.println(String.format("%3s", IsName.get(j)) + ",");
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("=================for each loop");

		for (Map<String, List<String>> m : al) {

			List<String> IsId = m.get("id");
			List<String> IsName = m.get("name");
			System.out.print("id=>");

			for (String id : IsId)
				System.out.print(id + ",");
			System.out.print("name=>");

			for (String name : IsName)
				System.out.print(name + " ");

			System.out.println();
		}

	}
}