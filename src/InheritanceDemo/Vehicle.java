package InheritanceDemo;
//Objects 11
/*
getClass()
clone()
finalize()
equals()
hashCode()
//wait - 3
// notify -2
toString()
*/
public class Vehicle {
	
	int price;
	String brand;
	                           // Alt + shifts + s -> Getters/setters
	public int getPrice() {
		return price;	
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		void blowHorn()
		{
			System.out.println("POM POM");		
		}
	}
