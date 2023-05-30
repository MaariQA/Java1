package INTERFACE;
public interface RBI {
	
	public static float INTERST_RATE = 0.1f;
	abstract void openAccount();
	void closeAccount();
	// java 1.8
	default void LeagalCompliance()
	{
		System.out.println("Legal compliance method just introduced in Appr 23");
	}
	static void loan()
	{
		System.out.println("Loan method just introduced from today");
	}

	private	void privateMethod()
	{
		System.out.println("this is private method intro in 9.0");
	}
	default void useprivateMethod()
	{
		privateMethod ();
	}
}

/* constructor is not allowed in interface
 * RBI()
 * {
 * System.out.println(**********);
 * }
 */
// public static final
