package Collection02;

import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// insertation order is maintained

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(100, "Chandu");
		lhm.put(400, "Aakash");
		lhm.put(600, "Siddesh");
		lhm.put(300, "Ravi");
		lhm.put(200, "Vaibhav");
		lhm.put(500, "Prashanth");
		System.out.println(lhm);
	}
}
