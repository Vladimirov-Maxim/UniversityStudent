package Comparators;

import Comparators.Student.*;
import Comparators.University.*;
import Enums.StudentComparators;
import Enums.UniversityComparators;

public class ComparatorForModels {

	private ComparatorForModels() {
	};

	public static StudentComparator getStudentComparator(StudentComparators sComparator) {

		return switch (sComparator) {
		case AVG_EXAM_SCORE -> new AvgExamScore();
		case CURRENT_COURSE_NUMBER -> new CurrentCourseNumber();
		case FULL_NAME -> new Comparators.Student.FullName();
		case UNIVERSITY_ID -> new UniversityId();
		default -> null;
		};

	}
	
	public static UniversityComparator getUniversityComparator(UniversityComparators uComparator) {
		
		return switch(uComparator) {
		case FULL_NAME -> new Comparators.University.FullName();
		case ID -> new Id();
		case MAIN_PROFILE -> new MainProfile();
		case SHORT_NAME -> new ShortName();
		case YEAR_OF_FOUNDATION -> new YearOfFoundation();
		default -> null;
		};
		
	}

}
