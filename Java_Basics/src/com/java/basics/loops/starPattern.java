package com.java.basics.loops;

public class starPattern {

	public static void main(String[] args) {
	
		/*for ( int i = 1; i <=10 ; i++)
		{
			System.out.println( " ");
			
			for( int j = 1; j<=i ; j++)
				
			{
				System.out.print("");
			}
			
			for (int k = 10 ; k > (2*i-1); k--)
			{
				System.out.print("*");
			}
		}*/
		int i, j, k;
		for(i=5;i>=1;i--)
		{
		for(j=5;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=1;k<(i*2);k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}

}
