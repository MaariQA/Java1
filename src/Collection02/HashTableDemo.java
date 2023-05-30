package Collection02;

	import java.util.Hashtable;
	import java.util.Map;
	
	public class HashTableDemo {
		public static void main(String[] args) {
			Map<Integer,String> map = new Hashtable<>();
			map.put(1, "Chandu");
			map.put(4, "Aakash");
			map.put(3, "Siddesh");
			map.put(2, "Ravi");
			System.out.println(map);
			// map.put(null, "null"); NPE
			//  map.put(10,null);
		}
	}