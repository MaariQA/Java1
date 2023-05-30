package INTERFACE;
public class CyberSuccessBank implements RBI {
	float getInterestRate()
	{
		return RBI.INTERST_RATE+2;
	}
	@Override
	public void openAccount() {
		System.out.println("Welcome");	
		System.out.println("CYBERSUCCESSBANK => account opened in 2 seconds");		
	}

	@Override
	public void closeAccount() {
		System.out.println("Sorry to see you go...");	
		System.out.println("CYBERSUCCESSBANK => account closed in 1 seconds");		
	}	
	void showLoadInterestRate()
	{
		System.out.println("interestrate:"+ getInterestRate());
	}
	public static void main(String[] args) {
		CyberSuccessBank csb = new CyberSuccessBank();
		// RBI rbi = new RBI();

		csb.openAccount();
		csb.closeAccount();
		csb. showLoadInterestRate();
		RBI.loan();
		csb.LeagalCompliance();
	}
}
