package InheritanceDemo;

public class Car extends Vehicle  {  // subclass/child class
	
	String color;
	float weight;
	
	@Override
	public String toString() {
		return "WEIGHT: " + this.getWeight() +"COLOR : " + this.getColor();
	}
	public String getColor() {
		return color;	
	}
	public float getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setWeight(float weight) {
		this.weight = weight ;
	}
	@Override
	void blowHorn()
	{
		System.out.println("PEEP PEEP");
	}

	public static void main(String[] args) {
		Car car =new Car();
		car.color  = "RED";
		car.weight = 1234.45f;
		System.out.println("Car color : " + car.getColor());
		System.out.println("Car weight : " + car.getWeight());
		
		System.out.println("-----------------------");
		car.price = 9999;
		car.brand = "Maruti";
		System.out.println("Vehicle/car price : " + car.getPrice());
		System.out.println("Vehicle/car brand : " + car.getBrand());
		
		System.out.println(car);
		System.out.println(car.toString());
		
		car.blowHorn();
		
		Vehicle v = new Vehicle();
		v.price = 1222;
		v.brand = "Hindal";
		v.getPrice();
		v.getBrand();
	}
}



