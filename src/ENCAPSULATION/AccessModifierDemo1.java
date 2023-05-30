package ENCAPSULATION;
public class AccessModifierDemo1 {
	private int defaultVariableAge;
	private int publicVariableAge;

	public static void main(String[] args) {

		AccessModifierDemo1  amd = new AccessModifierDemo1 ();
        amd.defaultVariableAge = 10;
		amd.publicVariableAge = 20;
		
		amd.showValueDefault();
		amd.showValuePublic();
	}
	void showValueDefault() {
        System.out.println("Default variable value: " + defaultVariableAge);
    }
    
    public void showValuePublic() {
        System.out.println("Public variable value: " + publicVariableAge);
    }
}


