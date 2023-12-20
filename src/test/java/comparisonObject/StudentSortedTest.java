package comparisonObject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Enums.StudentComparators;
import Main.Main;
import Model.Student;

public class StudentSortedTest {
	
	@Test
	public void AvgExamScore() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Анько Д.", "2", 1, 5f));
		students.add(new Student("Псков М.", "2", 2, 4.95f));
		students.add(new Student("Кудряшов М.", "1", 1, 4.8f));
		students.add(new Student("Буравкина В.", "3", 4, 3.85f));
		students.add(new Student("Жаринов Э.", "3", 3, 3.7f));
		
		Assert.assertEquals(Main.SortedStudents(StudentComparators.AVG_EXAM_SCORE), students);
		
	}
	
	@Test
	public void CurrentCourseNumber() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Анько Д.", "2", 1, 5f));
		students.add(new Student("Кудряшов М.", "1", 1, 4.8f));
		students.add(new Student("Псков М.", "2", 2, 4.95f));
		students.add(new Student("Жаринов Э.", "3", 3, 3.7f));
		students.add(new Student("Буравкина В.", "3", 4, 3.85f));
		
		Assert.assertEquals(Main.SortedStudents(StudentComparators.CURRENT_COURSE_NUMBER), students);
		
	}
	
	@Test
	public void FullName() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Анько Д.", "2", 1, 5f));
		students.add(new Student("Буравкина В.", "3", 4, 3.85f));
		students.add(new Student("Жаринов Э.", "3", 3, 3.7f));
		students.add(new Student("Кудряшов М.", "1", 1, 4.8f));
		students.add(new Student("Псков М.", "2", 2, 4.95f));
			
		Assert.assertEquals(Main.SortedStudents(StudentComparators.FULL_NAME), students);
		
	}
	
	@Test
	public void UniversityId() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Кудряшов М.", "1", 1, 4.8f));
		students.add(new Student("Псков М.", "2", 2, 4.95f));
		students.add(new Student("Анько Д.", "2", 1, 5f));
		students.add(new Student("Жаринов Э.", "3", 3, 3.7f));
		students.add(new Student("Буравкина В.", "3", 4, 3.85f));
		
		Assert.assertEquals(Main.SortedStudents(StudentComparators.UNIVERSITY_ID), students);
		
	}
	
}
