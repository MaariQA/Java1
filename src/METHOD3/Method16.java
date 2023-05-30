package METHOD3;

public class Method16 {
	float carpetArea;
	int noOfRooms;
	String city;
	String category;
	double price;
	
	void rent()
	{
		System.out.println("Rent is given to tenant");
	}
	
	void buy() {
		System.out.println("House baught");
	}
	
	void sell() {
		System.out.println("House sold");
	}
	public static void main(String[] args) {
		Method16 h1 = new Method16();
		System.out.println(h1.carpetArea + ":" + h1.category + " : " + h1.city + " : " + h1.price 
				+ " : " + h1.noOfRooms);
		
		h1.price = 125465;
		h1.carpetArea = 1200;
		h1.city = "Pune";
		h1.category = "3BHK";
		h1.noOfRooms = 3;
		System.out.println(h1.carpetArea + ":" + h1.category + " : " + h1.city + " : " + h1.price 
				+ " : " + h1.noOfRooms);
		
		Method16 h2 = new Method16();
		System.out.println(h2.carpetArea + ":" + h2.category + " : " + h2.city + " : " + h2.price 
				+ " : " + h2.noOfRooms);
		h2.price = 5489;
		h2.carpetArea = 900;
		h2.city = "Mumbai";
		h2.category = "2BHK";
		h2.noOfRooms = 2;
		System.out.println(h2.carpetArea + ":" + h2.category + " : " + h2.city + " : " + h2.price 
				+ " : " + h2.noOfRooms);
		
	}
}
