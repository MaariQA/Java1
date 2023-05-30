package InheritanceDemo03;

	public class Car extends Vehicle {
		// non static instance variable
		// characteristics/properties/attributes
		
		int noOfSeats;
		int noOfTyres;
		float average;
		int maxSpeed;
		String enginePower;
		// methods/functions
		
		void loadCarryingCapacity()
		{
			System.out.println("Car carries n load capacity");
		}
		void accelerate()
		{
			System.out.println("Car accelerates..");
			
		}
	}
