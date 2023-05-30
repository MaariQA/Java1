package INTERFACE;

public class RunnerRBI implements RBI {
	
	float getInterface()
	{
		return RBI.INTERST_RATE;
	}
	
	@Override
	public void openAccount() {
		System.out.println("You account has be opened successfully");
	}
	@Override
	public void closeAccount() {
		System.out.println("You account has be closeed successfully");
	}
	
	public static void main(String[] args) {
		
		RunnerRBI obj = new RunnerRBI();
		
   // RBI rbi = new RBI(); AS rbi IS AN INTERFACE AND WE CAN NOT CREATE ANOBJECT INTERFACE
	
		obj.openAccount();
		obj.closeAccount();
		System.out.println("RAte of interest:"+ obj.getInterRate()+ "%");
	}
}
