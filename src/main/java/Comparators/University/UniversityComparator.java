package Comparators.University;

import java.util.Comparator;

import Model.University;

public interface UniversityComparator extends Comparator<University> {
	int compare(University o1, University o2);
}
