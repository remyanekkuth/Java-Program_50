
//Write a program print "ping" if a number is divisible by 3,
//"pong" if a number is divisible by 5, and 
//"ping pong" if number is divisible by both, else print the number.

package com.java.programs.loops;

import java.util.Scanner;

public class ping_pong {
	
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer : ");
		int n = keyboard.nextInt();
		
		
		if(n % 3 == 0 && n % 5 == 0){
			System.out.println("ping pong");
		}
		else if(n % 3 == 0){
			System.out.println("ping");
		}
		else if(n % 5 == 0){
				System.out.println("pong");
		}
		
		else 
			System.out.println("the number is " + n);
		}

}
