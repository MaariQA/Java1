package InheritanceDemo2;

public class Taluka extends District {

	String tslukaName;
	int talukaPop;
	String MLName;

	void findAreaTaluka()
	{
		System.out.println("Taluka = > finding area");
	}
	void findPop()
	{
		System.out.println("Taluka Population");
	}
	// constructor
	Taluka()
	{
		// super ();
		System.out.println("Zero args Taluka constructor called"); 
	}
}

