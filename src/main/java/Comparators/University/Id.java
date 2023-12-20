package Comparators.University;

import org.apache.commons.lang3.StringUtils;

import Model.University;

public class Id implements UniversityComparator{

	@Override
	public int compare(University o1, University o2) {
		return StringUtils.compare(o1.getId(), o2.getId());
	}

}
