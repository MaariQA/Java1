package Protected;

public class Vehicle {
	int price;
	String name;
	public Vehicle(int price,String name) {
		super();
		this.price = price;
		this.name = name;
	}
	void showValues()
	{
		System.out.println("from Vehicle clas*******");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
		@Override
		public String toString() {
			return"Vehicle [price="+price+",name="+name+"]";
		}
	}
		
		
	


