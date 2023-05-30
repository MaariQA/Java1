package InheritanceDemo03;

public class RunnerCarVehicle {
public static void main(String[] args) {
			Vehicle   v1   =     new       Vehicle();
			// class ref    var operator constructor
			
			v1.color = "White";
			v1.isAutomatic = true;
			v1.isElectrics = true;
			v1.price = 10000;
			v1.weight = 3000;
			v1.applyBreak();
			v1.blowHorn ();
			v1.reverse();
			v1.run();
			System.out.println(v1.color + ":"+ v1.isAutomatic + ":" 
			                   +v1.isElectrics +":"+v1.price+":"+ v1.weight);
			
			Car car = new Car();
			// vehicles non static variables
			car.color= "Black";
			car.price = 2000;
			car.weight = 6000;
			car.isElectrics = false;
			car.isAutomatic = false;
			
			// cars non static variables
			car.noOfSeats = 5 ;
			car.noOfTyres = 5;
			car.average = 22.50f;
			car.maxSpeed = 120;
			car.enginePower = "1200 HP";
			
			//vehicles non static methods
			car.run();
			car.blowHorn();
			car.reverse();
			car.applyBreak();
			
		// car's non static variables
			car.loadCarryingCapacity();
			car.accelerate();
		}
	}

			