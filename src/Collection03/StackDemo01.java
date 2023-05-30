package Collection03;
// Demonstration of stack data structure from Collection framework

import java.util.Stack;

 public class StackDemo01 {

		public static void main(String[] args) {

			Stack<Integer> st = new Stack<>();
			st.push(10);
			st.push(20);
			st.push(30);
			st.push(40);
			st.push(50);
			
			System.out.println("size : " + st.size());
			System.out.println(st);

			System.out.println(st.peek());
			int val = st.pop();
			System.out.println("Value : " + val);  // 50
			System.out.println(st.peek());        // 40

			val = st.pop();
			System.out.println("value: " + val); // 40
			System.out.println(st.peek());       // 30

			val = st.pop();
			System.out.println("value: " + val); // 30
			System.out.println(st.peek());       // 20

			val = st.pop();
			System.out.println("value: " + val); // 20
			System.out.println(st.peek());       // 10

			val = st.pop();
			System.out.println("value: " + val); // 10
			System.out.println("st.isEmpty()?" + st.isEmpty());
			System.out.println("size : " + st.size());

			if(st.isEmpty())
				System.out.println(st.peek()); // EmptystackException

			st.push(1);
			st.push(2);
			st.push(3);
			System.out.println(st.get(0)); 
			// 1Returns the element at the specified position in the stack
			
			System.out.println(st.get(1)); // 2
			System.out.println(st.get(2)); // 3

			Stack<Integer> s1 = new Stack<>() {
		{
					push(1);
					push(2);
					push(3);
				}
			};
			Stack<Integer> s2 = new Stack<>() {
				{
					push(1);
					push(2);
					push(3);
				}
			};
			System.out.println("s1 HC :"+ System.identityHashCode(s1));
			System.out.println("s2 HC :"+ System.identityHashCode(s2));

			System.out.println(s1==s2);         // false
			System.out.println(s1.equals(s2)); // true

			Stack<Integer> s3 = new Stack<>() {
				{
					push(1);
					push(2);
					push(3);
				}
			};
			System.out.println("s3 HC :"+ System.identityHashCode(s3));
			System.out.println(s1==s3);         // false
			System.out.println(s1.equals(s3)); // false
		}
	}

