package InheritanceDemo2;

public class District extends State { 

	String districtName;
	int districtpop;
	String MPName;
	String language;

	void findAreaDistrict()
	{
		System.out.println("District => finding an area()");
	}
	void findPop()
	{
		System.out.println("District population");
	}
	// constructor
	District()
	{
		super();
		System.out.println("zero args District constructor called");
	}
}



