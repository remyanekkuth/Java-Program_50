package com.java.assignments;

public class TrainingDemo {

	public static void main(String args[]){
		
		Training training= new Training();
		training.setstudentDetails("Remya,ID-234,QA");
		training.setRecordings("java");
		training.setcourseContent("QA");
		training.instructor="medha";
		training.displayTraining();
		
		QATraining qa=new QATraining();
		qa.getcourseContent();
		
		System.out.println("************");
		
		Training training2=new Training("Welcome");
		training2.setstudentDetails("geeta,ID-267,UI");
		training2.setRecordings("Nov recording");
		training2.setcourseContent("UI");
		training2.instructor="Kumar";
		training2.displayTraining();
		
		
		UITraining ui=new UITraining();
		ui.getcourseContent();
	
	
	}
	
}
				