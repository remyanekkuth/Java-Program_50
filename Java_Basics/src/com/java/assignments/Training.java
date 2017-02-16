package com.java.assignments;

public class Training {
	
	private String studentDetails;
	protected String courseContent;
	String instructor;
	private String recordings;
	
	//default constructor
	public Training(){
		
		System.out .println("Intro to encapsulation and inheritance");
	}
	
	public Training(String greet){
		
		System.out.println("Hello everyone "+ greet);
		
	}
	
	public void setstudentDetails(String studentDetails){
		
		this.studentDetails=studentDetails;
		
	}
	public String getstudentDetails(){
		
		return studentDetails;
	}
	
	public void setcourseContent(String courseContent){
		
		 this.courseContent=courseContent;
		
	}
	
	public String getcourseContent(){
		
		return courseContent;
	}
	
	public void setRecordings(String recordings){
		
		this.recordings=recordings;
		
	}
	
	public String getRecordings(){
		
		return recordings;
	}
	
	
	public void displayTraining(){
		
		System.out.println("Here is the student details: " + getstudentDetails());
		System.out.println("The course content is : "+ getcourseContent());
		System.out.println("The instructor is : "+ instructor );
		System.out.println("You can access recordings here: "+ recordings);
	}

	
}
