package Protected;

public class Car extends Vehicle {
	String model;
	String color;

	public Car(int price, String name, String model, String color) {
		super(price,name);
		this.model = model;
		this.color = color;
	}
	void disp() {
		System.out.println("only car class method");
	}
	@Override
	void showValues() {
		System.out.println("for car class AAAAAAA");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getcolor() {
		return color;
	}
	public void SetColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return"car[model=" +model +", color=" + color+"]";
	}
	public static void main(String[]args) {

		Vehicle v1 = new Vehicle(1000,"Nano");
		System.out.println(v1.getName());
		System.out.println(v1.getPrice());

		Car c1 = new Car(10000,"Alto","lxi","White");
		c1.model = "SDFS";
		c1.color = "AAAAA";
		c1.getModel();
		c1.setName("AAAAA");

		c1.price = 120000;
		c1.name = ("ASDAS");
		c1.getPrice();

		// top casting / upcasting/ polygraphic ref/ polymorphic ref
		// runtime polymorphism
		//parent    child : allowed
		Vehicle vc = new Car(100000,"Innova","SUV","Red");

		vc.price = 123;
		vc.name = "ASDSAD";
		vc.getPrice();
		vc.setPrice(11111);
		vc.setName("ASDFASD");

		vc.showValues(); // car class showValue()

		/*		vc.name disp();  // not accessible since this method is defined in
				//class and not in Vehicle Class

				// this is not allowed
				// child      = parent
				   Car cv = new Vehicle(1001,"Nano1")
		 */
	}
}



