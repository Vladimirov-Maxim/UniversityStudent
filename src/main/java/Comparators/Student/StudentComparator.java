package Comparators.Student;

import java.util.Comparator;

import Model.Student;

public interface StudentComparator extends Comparator<Student> {
	int compare(Student o1, Student o2);
}
