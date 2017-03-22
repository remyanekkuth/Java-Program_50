package com.java.programs.general;

public class StaticBlockAndMethod {
	
	public String name ;
	private int age;
	
	// static variable
	
	private static String str = "THis is a static string" ;
	private static String country = "USA" ;
		
	
	// static block
	
	static{
		
		System.out.println("this is a static block");
		System.out.println("Static block will execute first");
	}
	
	//comstructor
	
	public StaticBlockAndMethod(String newStr,int newAge){
		
		this.name =  newStr;
		this.age = newAge ;
	}
	
	// static method
	
	public static void TestStaticMethod(){
		
		System.out.println("this is to practice static method and variables");
		System.out.println("call static variable" +  StaticBlockAndMethod .str);
		
	}
	// nonstatic method
	
	public void TestNonStaticMethod(){
		
		System.out.println("this is to test non static methods ");
		System.out.println(StaticBlockAndMethod.country);
		System.out.println("My name is : " + this.name);
		System.out.println("my age is : " + this.age);
		
	}
	

	public static void main(String [] args){
		
		StaticBlockAndMethod sbm = new StaticBlockAndMethod("john", 40);
		sbm.TestNonStaticMethod();
		StaticBlockAndMethod.TestStaticMethod();
		
		
	}

}
