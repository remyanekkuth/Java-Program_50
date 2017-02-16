package com.java.assignments;

public class OverridingDemo {

	public static void main(String[] args) {
		
		// object created for parent class Human_Override
		Human_Override human=new Human_Override();
	// 	human.eat();
	//	human.sleep();
		human.move();
		
		System.out.println("---------------------------");
		
	//object created for child class MenAndWomen
		
		MenAndWomen gend = new MenAndWomen();
		gend.eat();
		gend.move();
		
		
	}

}
