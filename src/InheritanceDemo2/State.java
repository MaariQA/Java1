package InheritanceDemo2;

public class State {
	// non static instance variable
	// properties/ attributes / characteristics
	
	String stateName;
	long ststePop;
	String capitalName;
	String language;
	
	// methods
	// non static methods
	
	void findAreaState()
	{
		System.out.println("State => Finding an area()");
	}
	void findPop()
	{
		System.out.println("state population");
	}
	// constructor
	State()
	
	{
		// super();
		System.out.println("zero args Stste constructor called");
		
		
}

}
