package com.java.programs.fileoperations;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputTypes {
	
	// scanner input
	
	public void ScannerMethod(){	
		int a,b;
		
		System.out.println("enter the integers : ");
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		int sum = a + b ;
		
		System.out.println("the sum of the two numbers is : " + sum);
	}
	
	//BufferedReader and InputStreamReader
	
	public void  BufferAndInputStream() throws IOException{
		
		int x , y ;
	
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the first number : " );
		x = Integer.parseInt(reader.readLine());
		System.out.println("enter second number :");
		y = Integer.parseInt(reader.readLine()); 
		
		int sub = x - y ;
		System.out.println("the difference is : " + sub);
		
	}
		// datainputstream - only work with binary data
		
		public void DataStreamMethod () throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		
		System.out.print("enter the first number : " );
		int s =  dis.readInt();
		//int i   = Integer.parseInt(s);
		
		System.out.println("enter the second number :");
		int s1 = dis.readInt();
		//double j = Double.parseDouble(s1);
		
		double mul = s * s1 ;
		System.out.println("the multiplication of two numbers is : " + mul);
		
		}	
		
		// ----using console ---
		public void consoleMethod(){
			
			
		Console console = System.console();
		if (console == null ){
			System.out.println("no console : not in interactive mode");
			System.exit(0);
		}
		
		
		/*System.out.println("enter first number");*/
		String i  = console.readLine();
		int x = Integer.parseInt(i);
		
		System.out.println("enter second number ");
		String j = console.readLine();
		double d = Double.parseDouble(j);
		
		double div = x / d ;
		System.out.println("the result after division is : "+ div);
		
		
		}

	public static void main(String[] args) throws IOException{
		
	ReadInputTypes types = new ReadInputTypes();
	
	//types.ScannerMethod();
	
	//types.BufferAndInputStream();
	
	// 0
	types.DataStreamMethod();
	//types.consoleMethod();
	}

}



