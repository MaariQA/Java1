package Method02;
public class Method7 {
	static	class StaticMemberDemo {
		static int age;                                // class variable
		static float weight = 88.0f;

		static int getAge() {
			return StaticMemberDemo.age;
		}
		public static void main(String[] args) {

			StaticMemberDemo.age = 12;
			System.out.println(StaticMemberDemo.age);      // static way
			System.out.println(StaticMemberDemo.weight);
			System.out.println(age);
			StaticMemberDemo.age = 20;
			System.out.println(StaticMemberDemo.age);

			System.out.println("age: " + StaticMemberDemo.getAge());
			StaticMemberDemo.heigth = 5.5f;
			System.out.println("StaticMemberDemo.height = " + StaticMemberDemo.heigth);
			System.out.println("age: " + StaticMemberDemo.getage1());
		}
		static float heigth;
		static int getage1() {
			return StaticMemberDemo.age;
		}
	}
}

