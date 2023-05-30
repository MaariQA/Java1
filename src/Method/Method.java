package Method;
public class Method {
static void printTable(int n) {
	for(int i=1;i<=10;i++){
		System.out.print(n*i);
		System.out.println(" ");
	}}
 	public static void main(String[]args) {
 		printTable(5);
	}
}