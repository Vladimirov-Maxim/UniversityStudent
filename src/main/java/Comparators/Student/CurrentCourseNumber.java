package Comparators.Student;

import Model.Student;

public class CurrentCourseNumber implements StudentComparator{

	@Override
	public int compare(Student o1, Student o2) {
		 return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
	}

	
}
