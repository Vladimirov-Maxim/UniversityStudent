package comparisonObject;

import Main.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import Enums.StudyProfile;
import Enums.UniversityComparators;
import Model.University;

public class UniversitySortedTest {

	@Test
	public void FullName() {
		
		List<University> universities = new ArrayList<University>();
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));
		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		
		Assert.assertEquals(universities, Main.SortedUniversities(UniversityComparators.FULL_NAME));
		
	}
	
	@Test
	public void Id() {
		
		List<University> universities = new ArrayList<University>();
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));
		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		
		Assert.assertEquals(universities, Main.SortedUniversities(UniversityComparators.ID));
		
	}
	
	@Test
	public void MainProfile() {
		
		List<University> universities = new ArrayList<University>();
		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));
		
		Assert.assertEquals(universities, Main.SortedUniversities(UniversityComparators.MAIN_PROFILE));
		
	}
	
	@Test
	public void ShortName() {
		
		List<University> universities = new ArrayList<University>();
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));
		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		
		Assert.assertEquals(universities, Main.SortedUniversities(UniversityComparators.SHORT_NAME));
		
	}
	
	@Test
	public void YearOfFoundation() {
		
		List<University> universities = new ArrayList<University>();
		universities.add(new University("3", "Московский технологический институт", "МТИ", 1950, StudyProfile.MATHEMATICS));
		universities.add(new University("2", "Московский государственный университет имени М.В. Ломоносова", "МГУ", 1963, StudyProfile.JURISPRUDENCE));
		universities.add(new University("1", "Российский биотехнологический университет", "РБУ", 1976, StudyProfile.MEDICINE));
		
		Assert.assertEquals(universities, Main.SortedUniversities(UniversityComparators.YEAR_OF_FOUNDATION));
		
	}
	
}
