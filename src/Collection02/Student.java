package Collection02;

public class Student {
	
		public static final int id = 0;
		int age;
		public String name;
		
		public Student(int age, String name) {
			//super();
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return "age="+ age + ": name = " + name;
		}
	}
