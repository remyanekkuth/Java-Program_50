package com.java.assignments;

public class Conversion {
	
	public static void main(String[] args) {
		byte b=5;
		short s=34;
		int i=-78;
		char c='a';
		long l=24567;
		float f=12.4f;
		double d=456794.345;
	
		// implicit casting
		System.out.println("s is "+ s);
		s=b;
		
		System.out.println("s is now "+ s);
		
		System.out.println("l is "+l);
		l=i;
		
		System.out.println("l is now"+ l);
		
		System.out.println("the character c is " + c);
		i=c;
		System.out.println("the value of c is "+i);
		
		f=l;
		System.out.println("the value of long is now " +f);
		
		d=f;
		System.out.println("the value of f is now" + d);
		
		
		System.out.println("---------------------------------");
		
		// explicit casting
		
		 b=(byte)s;
		 System.out.println("the value of byte is " + b);
		 
		 s=(short)i;
		System.out.println("the value of s is " + s);
	 
		i=(int)l;
		System.out.println("the value of int is now "+ i );
		
		c=(char)i;
		System.out.println("the characher is "+c);
		
		b=(byte)s;
		System.out.println("the byte is now "+b);
		
		

	}

}
