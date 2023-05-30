package ENCAPSULATION;
public class ConceptDemo {
	// static variable // class variables
	static int a;     //0
	static int b ;    // 0
	// non static variable //  instants variable
	float c;          //0
	float d;          // 0.0

	public static void main(String[]args) {
		int res = 0; 

		// accessing static variable
		res = ConceptDemo.a + ConceptDemo.b;
		System.out.println("res="+res);  // 0

		// accessing instance variable / non static variable
		ConceptDemo obj = new ConceptDemo();
		float res1 = obj.c +obj.d;
		System.out.println("res1 ="+res1);    // 0
	}
}


