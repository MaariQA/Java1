// method over loading
// change in sequence of parameter overload having diff data type no of arguments
package METHOD3;
public class Method10 {
	    static int add() {
	        return 10;
	    }

	    static int add(int a, int b) {
	        return a + b;
	    }

	    static int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    static float add(float a, float b) {
	        return a + b;
	    }

	    static float add(int a, float b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        int n1 = 12, n2 = 13;
	        float a = 1.2f, b = 3.4f;

	  //      System.out.println("add() => " + add());               // 10
	        System.out.println("add(n1, n2) => " + add(n1, n2));   // 25
	        System.out.println("add(n1, a) => " + add(n1, a));     // 13.2
	        System.out.println("add(a, b) => " + add(a, b));       // 4.6
	   //     System.out.println("add(n1, b) => " + add(n1, b));     // 15.4
	        System.out.println("add(a,b,c) => " + add(100,200,300)); // 37
	    }
	}
