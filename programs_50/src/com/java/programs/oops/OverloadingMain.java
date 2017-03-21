package com.java.programs.oops;

public class OverloadingMain {

	public static void main(String[] args) {
		
		Overload over = new Overload() ;
		Overload over1  =  new Overload();
		Overload over2 = new Overload();
		double vol ;
		
		over.Overload();
		
		vol = over.volume();
		System.out.println("the volume is  "+ vol);
		
		over1.Overload(4.3);
		
		vol = over1.volume();
		System.out.println("the volume is  "+ vol);
		
		over2.Overload(1.3, 3.5, 4.7);
		
		vol = over2.volume();
		System.out.println("the volume is "+ vol);
	}

}
