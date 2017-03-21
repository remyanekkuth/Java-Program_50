package com.java.programs.fileoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

	public class StringOccurence {

		
		public void occurrenceOfString() throws IOException{
		
			BufferedReader br = new BufferedReader(new FileReader("trial.txt"));
			
			String str = "" ;
			
			
		//String [] words = str.replaceAll("\\s+", "").split(" ");
		
		Map<String,Integer > map = new TreeMap<String , Integer>(); 
		
		{
			while (( str = br.readLine())!=null){
		
			String words [] = str.split("[, . \t \n \r : ; () {}  ]");
			
			for(int i = 0 ; i < words.length ; i++){
				
			String key = words[i].toLowerCase();
			
			if(!map.containsKey(key)){
				
				map.put(key, 1);
				
			}else  {
				map.put(key, map.get(key)+ 1 );
				
				}
			}
		}
			
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			
			//for (Map.Entry<String, Integer> entry : entrySet) {
			
				//System.out.println(entry.getValue() + "\t" + entry.getKey());
			
			System.out.println(map);
			
			}
		br.close();
		}
		

	
		public static void main(String[] args) {
				
		StringOccurence occ = new StringOccurence();
		
		try {
			occ.occurrenceOfString();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
}
}
	
			
			