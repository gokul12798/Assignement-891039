package org.assigment.Q5;

//Before Refactor and Encapsulating
/*
 * public class Course{
			public String courseId;  
			public String courseTitle;
			private String courseInstructor;
			
			public Course(){
				
			}
			
			getCourseInstructor(){return courseInstructor;}
			
			static int noOfInstructors;
			
		}
 */
//After refactoring and encapsulating using
//Getter and setter methods and converting variable to private type.
public class Course {
	private String courseId;
	private String courseTitle;
	private String courseInstructor;
	
 	private static int noOgInstructor;
 	
	public Course() {
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public static int getNoOgInstructor() {
		return noOgInstructor;
	}
	public static void setNoOgInstructor(int noOgInstructor) {
		Course.noOgInstructor = noOgInstructor;
	}

}
