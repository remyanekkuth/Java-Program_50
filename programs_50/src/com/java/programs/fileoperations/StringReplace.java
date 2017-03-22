package com.java.programs.fileoperations;

import java.io.*;

public class StringReplace {

	public static void main(String[] args) throws IOException {
		
		FileWriter in_file = new FileWriter("Replace.txt");
		
		BufferedWriter bw = new BufferedWriter(in_file);
		bw.write("Hello this is a sample text. This is to practice string replace.");
		bw.append("Replace a string with another string.  ");
		bw.flush();
		
		FileReader fr = new FileReader("Replace.txt");
		BufferedReader br = new  BufferedReader(fr);
		
		String search = "this is a sample text" ;
		String replace = "this document is to test " ;
		
		String str1 = " ";
		String str = null ;
		try {
		str = br.readLine();
		System.out.println(str);
		str1 = str.replaceAll(search,replace);
		bw.write("/n"+ str1);
		bw.close();
		System.out.println("after replacing a string :.............. \n" +  str1);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		bw.close();
	}

}
