// Demonstration of encapsulation using getter and setter method.
//and private instance variable

package ENCAPSULATION;
public class Employee01 {
	// instance variable non static variable default value -0,0,0, null
	
	private int eid;
	private float salary;
	private String name ; 
	
	// setter method to set the value
	public void Seteid(int eid) {
		this.eid=eid;
	}
	public void setSalary (float Salary) {
	this.salary = salary ;
	}
	public void setname (String name) {
	this.name = name;
	}
	
	// getter method reading the value
	public int getEid() {
	return this.eid ;
	}
	public float getSalary() {
	return this.salary ;
	}
	public String getName() {
	return this.name ;
	}
	public Employee01 (int eid,float salary,String name) {
	this.eid = eid; 
	this.salary = salary; 
	this.name =  name;
	}
	
	Employee01 getCurrentobject() {
	return this;  
	}  // return new Employee(12,1234,45f,"ADS")
	
    public void  showValue () {
    	System.out.println("this.eid" + this.salary +":"+this.name);
    }
    	public static void main(String[]argrs) {
    		Employee01 e1 = new Employee01(1, 123.5f,"Virat");
    		// e1.showValue ();
    		System.out.println(e1.eid +":"+e1.salary +":"+e1.name);
    		
    		Employee01 e2 = new Employee01(2,345.78f,"Rohit");
    		// e2.showValue();
    		System.out.println(e2.eid + ":" +e2.salary+ ":" +e2.name);
    	}
    	}

 




							

						
