package Day28May2023;

import java.util.Comparator;
	
	class ComparatorAscId  implements Comparator<Student>{

	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.id - s2.id;
	    }
	}

	class ComparatorDescId implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s2.id - s1.id;
	    }
	}

	class ComparatorAscName implements Comparator<Student> {
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.name.compareTo(s2.name);
	    }
	}
	error
	
  