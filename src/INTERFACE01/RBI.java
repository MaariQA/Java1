package INTERFACE01;
public interface RBI {
	/* constructor is not allowed in interface
	 * RBI()
	 * {
	 * System.out.println(**********);
	 * }
	 */
     // public static final
	public static float INTERST_RATE = 0;
	abstract void openAccount();
	         void CloseAccount();
	// java 1.8
	default void LeagalCompliance()
	{
		System.out.println("Legal compliance method just introduced in Appr 23");
	}
	static void loan()
	{
		System.out.println("Loan method just introduced from today");
	}
	
	private void privateMethod();
	default void useprivate()
	{
		privateMethod ();
	}
}
