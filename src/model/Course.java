package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {

	private String courseTitle;
	private String dept;
	private int schoolYear;
	private String term;
	private ArrayList<Section> sectionList;

	public Course (String courseTitle, String dept, int schoolYear, String term) {
		this.courseTitle = courseTitle;
		this.dept = dept;
		this.schoolYear = schoolYear;
		this.term = term;
		sectionList = new ArrayList<Section>();
	}

	public String getCourseTitle () {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDept () {
		return dept;
	}

	public void setDept (String dept) {
		this.dept = dept;
	}

	public int getSchoolYear () {
		return schoolYear;
	}

	public void setSchoolYear (int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public String getTerm () {
		return term;
	}

	public void setTerm (String term) {
		this.term = term;
	}

	public ArrayList<Section> getSectionList () {
		return sectionList;
	}

	public void addSection (int section) {
		Section newSection = new Section(section);
		sectionList.add(newSection);
	}

	public int getSectionIndex (int section) {
		int index = 0;
		for (Iterator<Section> itr = sectionList.iterator(); itr.hasNext(); index++) {
			if (section == itr.next().getSect()) {
				return index;
			}
		}
		return -1;
	}

}

