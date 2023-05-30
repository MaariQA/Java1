package ENCAPSULATION;
public class Employee03 {
	// instance variable/ non static variables
	
	private int priviteVariableAge;
	int defaultvariableAge;
	public int publicVariableAge;
	
	// method / Function
	private void showValuePrivate() {
		System.out.println("inside private ShowValue"+  priviteVariableAge);
	}
	void showValueDefault() {
			System.out.println("inside default showvalue"+ defaultvariableAge);
	}
   public void ShowValuepublic () {
	   System.out.println("inside showValue"+ publicVariableAge);
   }
	 public static void main(String[]args) {
		
		 Employee03  amd = new Employee03();
		 amd.priviteVariableAge = 10;
		 amd.defaultvariableAge = 20;
		 amd.publicVariableAge =  30;
		
		 amd.showValuePrivate();
		 amd.showValueDefault();
		 amd.ShowValuepublic();
	 }
}
