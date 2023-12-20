package Model;
import java.util.Objects;

import Enums.StudyProfile;

public class University {
	private String id;
	private String fullName;
	private String shortName;
	private int yearOfFoundation;
	private StudyProfile mainProfile;

	public University() {
	}
	
	public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.shortName = shortName;
		this.yearOfFoundation = yearOfFoundation;
		this.mainProfile = mainProfile;
	}

	public String getId() {
		return id;
	}

	public University setId(String id) {
		this.id = id;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public University setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public String getShortName() {
		return shortName;
	}

	public University setShortName(String shortName) {
		this.shortName = shortName;
		return this;
	}

	public int getYearOfFoundation() {
		return yearOfFoundation;
	}

	public University setYearOfFoundation(int yearOfFoundation) {
		this.yearOfFoundation = yearOfFoundation;
		return this;
	}

	public StudyProfile getMainProfile() {
		return mainProfile;
	}

	public University setMainProfile(StudyProfile mainProfile) {
		this.mainProfile = mainProfile;
		return this;
	}

	@Override
	public String toString() {
		return String.format("id = %s, fullName = %s, shortName = %s, yearOfFoundation = %s, mainProfile = %s", this.id,
				this.fullName, this.shortName, this.yearOfFoundation, this.mainProfile.getProfileName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, id, mainProfile, shortName, yearOfFoundation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		University other = (University) obj;
		return Objects.equals(fullName, other.fullName) && Objects.equals(id, other.id)
				&& mainProfile == other.mainProfile && Objects.equals(shortName, other.shortName)
				&& yearOfFoundation == other.yearOfFoundation;
	}

	
	
}

