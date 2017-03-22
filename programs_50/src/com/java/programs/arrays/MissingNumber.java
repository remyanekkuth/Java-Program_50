package com.java.programs.arrays;

public class MissingNumber {

	// sum of series of sorted element 
	
	public int sumOfSeries (int n)
	{
		int sum = (n * (n+1))/2 ;
		 return sum ;
	}
	
	// sum of elements in the array 
	
	
	public int sumOfArray(int []series)
	{
		int sum = 0;
		
		for(int i = 0; i < series.length ;i++)
		{
			sum += series[i];
		}
		return sum ;
	}
	public static void main(String[] args) {
		
		
		int [] series = { 1, 7, 2, 5, 8, 3, 4 };
		
		MissingNumber missing = new MissingNumber();
		
		int num_sum = missing.sumOfSeries(8);
		
		int series_sum = missing.sumOfArray(series);
		
		int missing_num = num_sum - series_sum ;
		
		System.out.println("the missing element is  ::" + missing_num);
	}

}
