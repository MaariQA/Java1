// concat function join or concatnets two string and allocated new memory
// Scenes string is immutable
package STRING02;
public class Concat {
	public static void main(String[] args) {
		String city1 = "Pune;";
		System.out.println(System.identityHashCode(city1));

		String city2 = "Mumbai";
		city1 = city1.concat(city2).concat("kolhapur").concat("Nagapur");
		System.out.println(System.identityHashCode(city1));

		System.out.println(System.identityHashCode(city1));
		System.out.println(System.identityHashCode(city2));
		System.out.println("----------------");

		String city3 = "satara";
		String city4 = "wai";
		System.out.println(city3);
		System.out.println(System.identityHashCode(city3));
		System.out.println(System.identityHashCode(city4));
		System.out.println("----------------");

		String city5 = "Bhor";
		System.out.println(System.identityHashCode(city5));
		String city6 = "khandala";
		city5 = city5.concat(city6);
		System.out.println(city5);
		System.out.println(System.identityHashCode(city5));
		System.out.println(System.identityHashCode(city6));
		System.out.println("----------------");
		
		String city7 = "Lhoam";
		System.out.println(System.identityHashCode(city7));
		String city8 = "keral";
		city7 = city7.concat(city8).concat("Nagpur").concat("kolhapur");
		System.out.println(city7);
		System.out.println(System.identityHashCode(city7));
		System.out.println(System.identityHashCode(city8));
		System.out.println("----------------");

		String s=50+30+"Sachin"+40+40;  
		System.out.println(s);   //80Sachin4040 
		System.out.println("----------------");

		String s1="Sachin ";  
		String s2="Tendulkar";  
		String s3=s1.concat(s2);  
		System.out.println(s3);    //Sachin Tendulkar
		
		String str="Sachin"+" Tendulkar";  
		System.out.println(str);    //Sachin Tendulkar
	}
}