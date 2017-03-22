package com.java.programs.general;

class Garbage{
	
	int id = 34;
	
	protected void finalize() throws Throwable {
		
	System.out.println("using finalize method , garbage collected ");
		
	}
}
public class GarbageCollection {

	
	public static void main(String[] args) {
		
	Garbage g = new Garbage();
	Garbage g1 = new Garbage();
	
	g = g1;
	
	System.gc();
	
	System.out.println("done");
		
	}
	

}
