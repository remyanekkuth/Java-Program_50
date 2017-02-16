package com.java.assignments;

public class Operators {

	public static void main(String[] args) {
		// arithmetic operators
		
		System.out.println("arithmetic operators : ");
		int a=15;
		int b=a+5;
		int c= b-10;
		int d=c*10;
		int e=d-c;
		double f=-c/3;
		double m=b%7;
		
		System.out.println("a is " + a);
		System.out.println("b is "+b);
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		System.out.println("e is "+ e);
		System.out.println("f is " + f);
		System.out.println("m is " + m);
		
		System.out.println("*********************");
		
		System.out.println("compound assignment operators");
		
		int p=5;
		int q = 9;
		int r=12;
		int s=5;
		
		p +=3;
		System.out.println("p is now " + p);
		
		q -=1;
		System.out.println("q is now " + q);
		
		r *=2;
		System.out.println(" r is now "+ r );
		
		s %=2 ;
		System.out.println("s is now :" + s);
		
		p/=2;
		System.out.println("p is now " + p);
		
		System.out.println("*******************");
		
		System.out.println("increment and decrement operators");
		
		int a1=3;
		int b1=4;
		int c1,d1;
		
		c1=a1++;
		d1=++c1;
		++d1;
		b1=d1--;
		a1=--c1;
		
		System.out.println("a1 is :" +a1);
		System.out.println("b1 is :"+ b1);
		System.out.println("c1 is :"+ c1);
		System.out.println("d1 is :" + d1);
		
		System.out.println("-----------------------------");
		
		System.out.println("bitwise operators");
		
		String binary []={"0000","0001","0010","0011","0100","0101","0111","1000","1001","1010"};
		int x=6;
		int y=3;
		
		int z= (x|y);
		int z1=(x&y);
		int z2=(x^y);
		int z3=(~z & z2);
		
		System.out.println("z is "+ binary[z]);
		System.out.println("z1 is "+ binary[z1]);
		System.out.println("z2 is "+ binary[z2]);
		System.out.println("z3 is "+ binary[z3]);
		
		// left and right shift operators
		
		byte x1=30, b2;
		int i,j;
		i=(x1<<2);
		b2=(byte)i;
		j=(x1>>3);
		int l =(x1>>>2);
		int k=14;
		k>>=2;
		i^=j;
		
		System.out.println("i is :" + i);
		System.out.println("b2 is " + b2);
		
		System.out.println("j is "+ j);
		System.out.println("k is " + k);
		System.out.println("l is "+ l );
		
		System.out.println("--------------------");
		
		// RELATIONAL OPERATORS
		
		int w=24;
		int u = 35;
		boolean v= w < u;
		boolean m1=true;
		
		System.out.println("output is " + v);
		
		
		if (u==w){
			
			System.out.println("the output is :" +m1 );
			
		}
		else 
		
			if(u>=w)
			{
				System.out.println("u is greater than w");
			}
			else {
				System.out.println("u is less  than w ");
		}
			
		
			System.out.println("***********************");

		// boolean logical operators
			
			boolean x2=true;
			boolean x3=false;
			boolean y1=x2 | x3;
			boolean y2=x2 & x3;
			boolean y3=x2 ^ x3;
			boolean y4 = (!x2 | x3)&& (y3 & !x3);
			
			System.out.println("output of OR is :"+ y1);
			System.out.println("output of AND is :"+ y2);
			System.out.println("output of XOR is :"+ y3);
			System.out.println("output of expression is :"+ y4);
			
			
			// ternary logical operator
			
			int o=10, n;
			
			n=o<0 ? -1 : 1 ;
			
			System.out.println("example for ternary operator");
			System.out.println("the condition is :" + n);			
		
		
			}	
		
		
	}


