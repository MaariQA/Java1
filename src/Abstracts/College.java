package Abstracts;

public  class College extends UniversityDemo {
	
	College()
	{
		System.out.println("College constructor create");
	}
	public void getAddmissionForCollege() 
	{
		System.out.println("Taking admission to the college...");
	}
	
	@Override
	public void exam()
	{
		System.out.println("Appearing for the exam..");
	}
	
	@Override
	public void admission() {
		System.out.println("taking admission");
	}
	@Override
	public void account () {
		System.out.println("perfomring accounting for all University");
	}
	
	public static void main(String[] args) {
		College c = new College();
		
		c.account();
		c.admission();
		c.exam();
		c.getAddmissionForCollege();
		c.getStudentDetails();
		c.result();
		
		University.builiding();
		c.builiding();
		
		c.library();
		
		c.age = 123;
		System.out.println("c.age");
		System.out.println("University.city");
	}}