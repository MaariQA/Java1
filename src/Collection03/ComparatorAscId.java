package Collection03;
	// Comparator interface implementing compare method

	import java.util.Comparator;
	class ComparatorAscId implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getId() - s2.getId();            // -ve, 0, +ve no
		}
	}

	class ComparatorDescId implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return s2.getId() - s1.getId();             // -ve,0, +ve no
		}
	}

	class ComparatorAscOnName implements Comparator<Student> {
		@Override
		public int compare (Student s1, Student s2) {
			return s2.getName().compareTo(s1.getName());
		}
	}

