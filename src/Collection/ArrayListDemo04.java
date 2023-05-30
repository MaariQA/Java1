package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo04 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>() ;
		System.out.println("Size: " + al.size());

		al.add("Virat");
		al. add("Rohit");
		al. add("Dhoni");
		System.out.println(al);
		String sAl = al.toString();
		System.out.println("String form addAll: "+ sAl);
		System.out.println(sAl.length());
		String[] tokens = sAl.split(",");

		for(String s: tokens)
			System.out.println(s);

		System.out.println(tokens[0]);  // [Virat
		System.out.println(tokens[0].replace("[","").trim());
		System.out.println(tokens[1].trim());

		System.out.println(tokens[2].trim().replace("]", ""));

		al.add("Sachin");
		al.add(2,"Arjun");
		System.out.println(al);
		al.add(0,"Hardik");
		System.out.println(al);
		String s1 = al.set(1, "Virat Kohli");  // to update/modify an element
		System.out.println("s1 -> " + s1);
		System.out.println(al);

		String str = al.remove(4);
		// returns existing  value which is going to be removed
		System.out.println(str);
		System.out.println(al);

		// String s2 = al.remove(100); // java.util.IndexOutOfBoundException: 
		//Index 100 out of bound for length 5
		// System.out.println(s2);

		boolean res = al.remove("Sachin"); // return boolean value 
		System.out.println("res :" + res);
		System.out.println("al: " + al);

		res = al.remove("Rishabh");
		System.out.println("res: " + res);
		System.out.println(al);

		List<String> all = new ArrayList<>();
		all.add(("Smriti"));
		all.add(("Mitali"));
		all.add(("Haraman"));

		res = al.addAll(all);
		res = al.add("res: " + res);
		System.out.println(al);
		
		res = al.addAll(0,all);
		System.out.println(al);

		/* al. clear(); // clear removes all elements from the list
		 * System.out.println("al : " + al);\
		 * System.out.println("isEmpty: " + al.isEmpty());
		 * al.clear();
		 */

		res = al.contains("Arjun");
		System.out.println("res: " + res);
		
		res = al.containsAll(all);
		System.out.println("res:" + res);


		List<String> al2 = new ArrayList<> 
		(Arrays.asList("Harman","Mitali","Smriti"));
		
		res = al.containsAll (al2);
		System.out.println("res: " + res);
		al2.add("Julan");
		System.out.println("al2:" + res);
		res = al.contains(al2);
		// does not matter the order of string in a array list
		System.out.println("res:" + res);

		int i = al.indexOf("Harman");
		System.out.println("i:" + i);
		i = al.lastIndexOf("Smriti");
		System.out.println("i : " + i);

		System.out.println("------------");
		System.out.println("al : " + al);
		System.out.println("al2: " + al2);
		al.remove(al2);
		System.out.println("al"	+ al);

		List<String>l1 = new ArrayList<>(Arrays.asList("1","2","3","4"));
		List<String>l2 = new ArrayList<> (Arrays.asList("4"));
		l1.addAll(l2);
		System.out.println("l1: " + l1);
		l1.remove(l2);
		System.out.println("al: " + l1);

		System.out.println("al: " + al);
		al .add("Dhoni");
		al.add("Sachin");
		al.add("Shikhar");
		System.out.println("al: " + al);

		//List<String> s1 = al.SubList(1, 4)
		// System.out.println("sl: " + s1);

		al.subList(1, 4).clear();			
		System.out.println("al: " + al);
	}
}








































//			String fn = "H:\\ CSTBatch5556java\\day16May23\\ContinueDemo.class";
//			
//			File f = new File(fn);
//			f.createNewFile();
//			
//	/* FileOutputStream fos = new FileOutputStream(f);
//	  String str = "My country name is India";
//	  byte[] ba = str.getBytes();
//	  fos.write(ba);
//	  fos.close();
//	  */
//			FileInputStream fis = new fileInputStream(f);
//			byte[] bal = fis.readAllBytes();
//			for(byte x: bal)
//				System.out.println(x);
//		}
//}
	
