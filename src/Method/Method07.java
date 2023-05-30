// Apps
package Method;
public class Method07 {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
			if(isperfect(i)) {
				System.out.println(i);
			}}}
	
	private static boolean isperfect(int number) {
		int sumoffactor=0;
		for(int i=1;i<=number/2;i++) {
			if(number % i== 0) {
				sumoffactor = sumoffactor + i;
			}}
		return sumoffactor == number;
	}
	
	private static void printTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(number*i);
		}}
	
	private static void printPrimefactors(int number) {
		for(int i=2; i<=number/2; i++) 
			if(number % i== 0) {
			if(isprime(i)) {
				//	System.out.println(i);
				}}}
	
	private static boolean isprime(int number) {
		boolean isprime=true;
		for(int i=2;i<=number/2;i++) {
			if(number%i== 0) {
				return false;
			}}
		return isprime;
	}
}

