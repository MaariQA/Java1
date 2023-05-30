package FunctionaIInterFace01;

// Is a given EVEN or not using Lambda Expression?

interface I2
{
	public boolean test(int no);
}
public class FindingEvenNoUseingLambdaExpression {
	public static void main(String[] args) {
		// When there is a return statement we have to enclosed body
		{}
		I2 obj = (int no) -> {return no%2 == 0;};

		System.out.println("is 100 Even no? :" + obj.test(100)); // true

		System.out.println("is 101 Even no? :" + obj.test(101)); // false

		// or small code
		I2 obj1 = no -> no%2 == 0;
		System.out.println("is 100 Even no? : " + obj1.test(100)); // true

		System.out.println("is 103 Even no? : " + obj.test(103));  // false
	}
}

