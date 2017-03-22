package com.java.programs.loops;

import java.util.Scanner;

public class input_command {

	public static void main(String[] args) {
		
		System.out.println("enter name  : ");
		Scanner scan = new Scanner(System.in);
		String i= scan.next();
		
		System.out.println(i);
		
		System.out.println("*********************");
		System.out.println("enter input : ");
		int j = scan.nextInt();
		System.out.println(j);
	}

}
