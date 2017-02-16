package com.java.assignments;

public class ObjectDemo {

	public static void main(String args[]) {
		
		Objects obj= new Objects();
		obj.object_name="mobile";
		obj.type="portable";
		obj.object_id=10;
		obj.setName("mobile");
		obj.displayDetails();
		
		System.out.println("************");
		Objects obj1= new Objects("World of Java classes ");
		obj1.object_name="laptop";
		obj1.type="foldable";
		obj1.object_id=1020;
		obj1.setName("laptop");
			
		obj1.displayDetails();
	}
}
