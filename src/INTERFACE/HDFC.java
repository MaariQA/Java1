package INTERFACE;

public class HDFC implements RBI {

	@Override
	public void openAccount() {
		System.out.println("Please com have a tea/coffee");	
		System.out.println("Please wait your account is opening share Mob.no");	
		System.out.println("Heyy your account open successful");	
	}
	@Override
	public void closeAccount() {
		System.out.println("Do you have any suggestion for us?");	
		System.out.println("Please wait your account is closing shortly..");	
		System.out.println("Account close successfully see you again");	
	}
	float getInterestRate()
	{
		return RBI.INTERST_RATE+2.5f; 
	}
		void showInteresteToCustomer()
		{
			System.out.println(getInterestRate());
		}
		public static void main(String[] args) {
			HDFC hdfc = new HDFC();
			hdfc.openAccount();
			hdfc.showInteresteToCustomer();
			hdfc.closeAccount();
			hdfc.LeagalCompliance();
			hdfc.loan();
			hdfc.useprivateMethod();
		}
	}
