package com.java.programs.fileoperations;

import java.io.File;

public class FileInFolder {

	public static void main(String[] args) {
	
		File file = new File("C:\\");
		File [] files_In = file.listFiles();
		for(File f : files_In){
			System.out.println(f.getName());
		}
	}

}
