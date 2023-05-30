package Collection02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HasMapOfStudent {
	public static void main(String[] args) {
		Map<Integer,Student> map = new HashMap<>();

		Student s1 = new Student(22,"Chandu");
		Student s2 = new Student(22,"Ravi");
		Student s3 = new Student(22,"Siddehesh");
		Student s4 = new Student(22,"Aakash");
		map.put(1, s1);
		map.put(4, s2);
		map.put(3, s3);
		map.put(2, s4);

		System.out.println(map);
		Set<Integer> ks=map.keySet();
		Iterator<Integer> iter = ks.iterator();
		while(iter.hasNext())
		{
			Integer id = iter.next();
			Student s = map.get(id);
			System.out.println("id = "+ id + ":" + s.age + ":"+ s.name);
		}
		System.out.println("-------------");
		// using enhanced for loop
		for(Map.Entry<Integer, Student> entry : map.entrySet())
		{
			// System.out.println(entry);
			// System.out.println("key =>" + entry.getKey() + " value+>"+ entry.getValue());
			Student s= entry.getValue();
			System.out.println(entry.getKey() + ":" + s.age +":" + s.name);
		}
	}
}