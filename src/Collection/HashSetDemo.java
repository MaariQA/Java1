package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer>set = new HashSet<>();
			
			boolean res = set.add(10);
			System.out.println(res);
			set.add(20);
			set.add(30);
			set.add(40);
			set.add(50);
			System.out.println(set);
			res = set.add(10);
			System.out.println(res);
			System.out.println(set);
			set.add(null);
			System.out.println(set);
			res = set.add(null);
			System.out.println(res);
			System.out.println(set);
			System.out.println("==========");
			Iterator<Integer> iter = set.iterator();

			while (iter.hasNext())
			{
				Integer i = iter.next();

				System.out.println(i + ":" + System.identityHashCode(i));
			}
			String str = set.toString();
			System.out.println(str + " str.len : " + str.length());

			Set<Integer>
			set1 = new HashSet() {
				{
					add(1);
					add(2);
					add(30);
				}
			};
			res = set.addAll(set1);
			System.out.println(res);
			System.out.println(set1);
			System.out.println(set);

			set.clear();
			System.out.println(set1);
			System.out.println(set1.isEmpty());
			System.out.println(set1.size());

			Set<Integer> set2 = new HashSet<Integer>(Set.of(10,20,30));
			res = set.retainAll(set2);
			System.out.println("res : " + res);
			System.out.println("set : " + set);
			System.out.println("set : " + set2);
		}
	}

