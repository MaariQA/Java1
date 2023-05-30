package Collection03;

public class Emp implements Comparable<Emp> {
	
	int eId;
	String name;
	
	public Emp(int eId,String name) {
		super();
		this.eId = eId;
		this.eId = eId;
	}
	
	@Override
	public String toString() {
		return "Emp[eId = " + eId + ", name = " + name + "]";
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Emp that) {
		
		// sort on eId Asc
		// return this.geteId() -that.geteId();
		
		// sort oneId Desc
		// return that.geteId().compareTo(that.geteId());
		
		// sort oneId Asc
		// return that.geteName().compareTo(that.getName());
		
		// sort oneId Desc
		return that.getName().compareTo(this.getName());
	}
}

