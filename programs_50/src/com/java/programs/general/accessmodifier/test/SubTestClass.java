package com.java.programs.general.accessmodifier.test;

import com.java.programs.general.accessmodifier.*;

public class SubTestClass  {
	
	public static void main(String[] args) {
		
		BaseTest base = new BaseTest();
		
		SubClass  sub = new SubClass();
		
		//public 
		
				System.out.println("the value of id is : " + sub.id);
				
				sub.setId(1111);
				
				System.out.println("the value of id is now : " + sub.id);
				
				System.out.println("the new id is " + base.getId_New());
				
				System.out.println("-----------------------------------");
				/*// private --> only accessiblie with in the class
				
				System.out.println("the value of name is " + sub.name);
				sub.name = "JOhn";
				System.out.println("the name is now : " + sub.name);
				*/
				System.out.println("the private modifier can't access in another  class or another package");
				System.out.println("-----------------------------------");
				
				//protected --  > accessible in classes of same package and subclass of another package
				
				/* System.out.println("the phone number is : " + sub.ph);
				sub.setId(459803490);
				
				System.out.println("the phone number is : " + sub.ph);
				*/
				System.out.println("the phone number is  " +  base.getPh_New());
				
				System.out.println("-----------------------------------");
				
				//default ----> accessible within classes  of  same package only
				
				/*System.out.println("the value of a is "  +sub.a);
				
				sub1.setA(45);
				System.out.println("the value of a is now " + sub.a);
				
				*/
				System.out.println("the default modifier is accessible only to the classes of same package");
				
		
	}

	
}
