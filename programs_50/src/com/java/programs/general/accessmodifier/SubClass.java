package com.java.programs.general.accessmodifier;

public class SubClass extends BaseClass {
	
	public static void main(String [] args){
		
		BaseClass base = new BaseClass();
		
		SubClass sub = new SubClass();
		
		//public 
		
		System.out.println("the value of id is : " + sub.id);
		
		sub.setId(23465);
		
		System.out.println("the value of id is now : " + sub.id);
		
		System.out.println("-----------------------------------");
		/*// private --> only accessiblie with in the class
		
		System.out.println("the value of name is " + sub.name);
		sub.name = "JOhn";
		System.out.println("the name is now : " + sub.name);
		*/
		System.out.println("the private modifier can't access in another  class");
		System.out.println("-----------------------------------");
		//protected -- >
		
		System.out.println("the phone number is : " + sub.ph);
		sub.setPh(459803490);
		System.out.println("the phone number is : " + sub.ph);
		
		System.out.println("-----------------------------------");
		
		//default ----> accessible within classes  of  same package
		
		System.out.println("the value of a is "  +sub.a);
		
		sub.setA(45);
		System.out.println("the value of a is now " + sub.a);
		
		
		
		
	}

}
