package Collection;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;

	public class ListIteratorDemo {

		public static void main(String[] args) {

			List<Integer> al = new ArrayList<>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			System.out.println(al);

			for(int i=0;i<al.size();i++)
				System.out.println(al.get(i));
			
			for(Integer x: al)
				System.out.print(x+",");

			System.out.println("Universal Iterator =>");
			Iterator<Integer> iter = al.iterator();
			
			while(iter.hasNext())
				System.out.println(iter.next());
			System.out.println("List iterator#1 =>");

			ListIterator<Integer> lIter = al.listIterator();
			while(lIter.hasNext())
				System.out.println(lIter.next());

			System.out.println("List iterator#2 =>");
			while(lIter.hasPrevious())
				System.out.println(lIter.previous());
		}
	}