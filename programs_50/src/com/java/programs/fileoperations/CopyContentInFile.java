package com.java.programs.fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyContentInFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null ;
		FileOutputStream fos = null;
		
		File file = new File("C:/Users/remya/Desktop/sample.txt");
		File out_file = new File("C:/Users/remya/Desktop/output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str1 = null;
		BufferedWriter bw = new BufferedWriter(new FileWriter(out_file));
		
		while((str1=br.readLine())!= null)
		{
			bw.write(str1);
			bw.newLine();
		}
	
		 br.close();
		 bw.close();
		 
			System.out.println("the file copied to destination");
			
			BufferedReader read = new BufferedReader(new FileReader(out_file));
			String str = null;
			while ((str = read.readLine())!= null){
			System.out.println(str);
			}
	}
}


