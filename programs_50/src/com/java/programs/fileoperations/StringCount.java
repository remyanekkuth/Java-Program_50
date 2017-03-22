package com.java.programs.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("trial.txt"));
		
		int count = 0 ;
		
		String str = "" ;
		
		while (( str = br.readLine())!=null){
			
			System.out.println(str);
			
			String words [] = str.split(" "); 
			
		// 	String words[] =  str.replaceAll("\\s+"," ").split(" ");
			
			for(int i = 0 ; i < words.length ; i++){
				
				if(words[i].length() > 0)
				{
					count++;
				}
			}
		}
		
		System.out.println("Word count is :" + count);
		
		br.close();
			
		}
		
	}
	

