package com.java.basics.oops;

public class Animal {
	
	//properties
	public String name;
	String color;
	String breed;
	//default constructor
	public Animal(){
		System.out.println("THis is a constructor");
		
	}
	//parameterised constructor
	public Animal(String greet){
		System.out.println("Hello--"+greet);
	}
	//behaviour or actions
	public void eat(){
		
		System.out.println("it eats food");
	}
	public void makeNoise(){
		
		System.out.println("It makes noise");
	}
	public void displayDetails(){
		
		System.out.println("Name is "+ name);
		System.out.println("Color is"+color);
		System.out.println("Breed is "+ breed);
		
	}
	public void setName(String inputName){
		name=inputName;

}
	public void setColor(String inputColor){
		color=inputColor;
	}
}
