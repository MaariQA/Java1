package METHOD3;

public class Method15 {
	String color;
	int noOfWheels;
	boolean ifElectric;
	float weight;
	
	void start()
	{
		System.out.println("Vehical Start");
	}
	public static void main(String[] args) {
		Method15 v1 = new Method15();
		
		Method15 v2 = new Method15();
		
		System.out.println("v1.hashCode =>" + v1.hashCode());
		System.out.println("v2.hashCode =>" + v2.hashCode());
		v1.color ="Red";
		v1.noOfWheels = 12;
		v1.weight = 123356548.125f;
		System.out.println(v1.color + " : " + v1.noOfWheels + " : " + v1.weight);
		
		System.out.println("-------------------------------");
		
		v2.color = "white";
		v2.noOfWheels = 6;
		v2.weight = 251545.5515f;
		System.out.println(v2.color +" : " + v2.noOfWheels + " : " + v2.weight);
		
		System.out.println("----------------------");
		
		Method15 v3 = new Method15();
		System.out.println(v3.color + " : " + v3.noOfWheels + " : " + v3.weight);
		v3.start();
	}
}
