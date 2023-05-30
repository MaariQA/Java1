package Arrays02;

import java.util.Objects;

public class Emp {
	int  id;
	String name;

	public Emp(int id, String name) {
		supre();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	// we have to override equal method from objects in order to compare 2 object, in
	// this case we are trying to compare 2 EMP object
	@Override
	public boolean equals(Object obj) {
		Emp that = (Emp) obj;
		if(this.id == that.id && Object.equaLs(this.name,that.name))
			return true;
		else
			return false;

	}
}
