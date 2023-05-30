package Day28May2023;

 public class Student {
	// non static variable or instance variables
	int id;
	String name;
	
	// 2 argument defined constructor
	public Student(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	// to represent an object into string
	@Override
	public String toString() {
		return " id" + id + ", name" + name+ "\n";
		
	}

}
