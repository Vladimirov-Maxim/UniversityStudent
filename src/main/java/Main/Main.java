package Main;

import java.util.ArrayList;
import java.util.List;

import Comparators.*;
import Comparators.Student.StudentComparator;
import Comparators.University.UniversityComparator;
import Enums.StudentComparators;
import Enums.StudyProfile;
import Enums.UniversityComparators;
import Model.Student;
import Model.University;

public class Main {

	public static void main(String[] args) {

		SortedStudents(StudentComparators.AVG_EXAM_SCORE).forEach(a -> System.out.println());
		
		System.out.println();

		SortedUniversities(UniversityComparators.YEAR_OF_FOUNDATION).forEach(a -> System.out.println());

	}

	public static List<University> SortedUniversities(UniversityComparators uComparators) {

		List<University> universities = new ArrayList<University>();

		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));

		UniversityComparator uComparator = ComparatorForModels.getUniversityComparator(uComparators);
		return universities.stream().sorted(uComparator).toList();
	}

	public static List<Student> SortedStudents(StudentComparators sComparators) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Жаринов Э.", "3", 3, 3.7f));
		students.add(new Student("Псков М.", "2", 2, 4.95f));
		students.add(new Student("Анько Д.", "2", 1, 5f));
		students.add(new Student("Кудряшов М.", "1", 1, 4.8f));
		students.add(new Student("Буравкина В.", "3", 4, 3.85f));

		StudentComparator sComparator = ComparatorForModels.getStudentComparator(sComparators);
		return students.stream().sorted(sComparator).toList();
	}

}
