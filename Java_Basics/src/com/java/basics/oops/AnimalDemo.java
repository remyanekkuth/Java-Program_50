package com.java.basics.oops;

public class AnimalDemo {

	public static void main(String[] args) {
		//object or instance
		Animal  ani= new Animal();
		ani.color="white";
		ani.name="puto";
		ani.breed="pug";
		ani.displayDetails();
		ani.makeNoise();
		
		Animal ani1= new Animal("remya");
		ani1.setName("Rexy");
		ani1.setColor("black");
		ani1.breed="pug";
		ani1.displayDetails();
		

	}

}
