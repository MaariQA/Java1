// Table Method
package METHOD3;
public class Method03 {
	public static void main(String[] args) {
		int n = 3;
		showtable (n);
	}
	static void showtable(int no) {
		for(int cnt=0; cnt<=10; cnt++) {
			System.out.println(no*cnt+" ");
		}
	}
}
