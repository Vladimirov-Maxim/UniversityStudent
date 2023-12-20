package Comparators.Student;

import org.apache.commons.lang3.StringUtils;

import Model.Student;

public class FullName implements StudentComparator{

	@Override
	public int compare(Student o1, Student o2) {
		return StringUtils.compare(o1.getFullName(), o2.getFullName());
	}

}
