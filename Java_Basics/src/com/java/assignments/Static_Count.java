package com.java.assignments;

public class Static_Count {
	
	public String userName;
	
	public String passWord;
	
	public static String greet="Hello welcome";
	public static int count=0;
	
	void login(){
		
		System.out.println(greet);
		System.out.println("the user name of this person is :"+ userName);
		System.out.println("enter your password here ::"+ passWord);
		
		}
	
	void count(){
		
		count++;
		System.out.println("The count of the objects is  :: "+ count);
		
		
	}

}
