package com.java.assignments;

public class StaticCountDemo {

	public static void main(String[] args) {
		
		Static_Count st1=new Static_Count();
		st1.userName="remya";
		st1.passWord="********";
		st1.login();
		st1.count();
		System.out.println("----------------------------");
		
		
		Static_Count st2=new Static_Count();
		st2.userName="Anu";
		st2.passWord="****";
		st2.login();
		st2.count();
		
		Static_Count st3=new Static_Count();
		st3.count();
		

	}

}
