package Abstracts;

public abstract class UniversityDemo extends University {
	// abstract method
	public abstract void exam();

	//non abstract  method
	public void result()
	{
		System.out.println("you result is on xyz date...");
	}
	
	UniversityDemo()
	{
		System.out.println("UniversityDemo constructor create...");
	}
}