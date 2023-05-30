package FunctionaIInterFace01;

import java.util.function.Consumer;

//Consumer interface is a function interface
// Consumer interface accepts one parameter.
// interface has only accept method
public class ConsumerInterFaceDemo {
	
	public static void main(String[] args) {
		Consumer<String> c = str -> System.out.println("Hello" +str);
		c.accept("Rohit");
		c.accept("Virat");
	}
}