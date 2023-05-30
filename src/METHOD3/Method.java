// variable array length
package METHOD3;
public class Method {

	static int add (int...a) {
		int S = 0;
		for(int x:a)
			S = S+x;
		return S ;
	}
	public static void main(String[] args) {
		System.out.println("add(1,2,3,):"+add(1,2,3));   //6
		System.out.println("-".repeat(30));
		int a = add(45,67);
		System.out.println("add(45,67):"+a);            // 112
		System.out.println("-".repeat(30));
		System.out.println("add:"+add(67,45,23,4));    // 139
	}
}