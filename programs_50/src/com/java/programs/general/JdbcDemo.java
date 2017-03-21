package com.java.programs.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
		   
		   Connection conn = null;
		   
		     Statement stmt = null;
		   
		   try{
		      //STEP 2: Register JDBC driver
			   
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating database...");
		      stmt = conn.createStatement();
		      
		   // insert into sql
		      
		      /*String sql = "INSERT INTO Registration " +  "VALUES (100, 'tara', 'meenu', 10)";
		      			stmt.executeUpdate(sql);
		      		sql = "INSERT INTO Registration " + "VALUES (101, 'Manu', 'fanaa', 26)";
		      		
		      		stmt.executeUpdate(sql);
		      		
		      		sql = "INSERT INTO Registration " +  "VALUES (102, 'john', 'cody', 50)";
		      		stmt.executeUpdate(sql);
	    
		
		      		System.out.println("Inserted records into the table...");*/
		      
		      // select a record
		      
		  //   String sql = "SELECT id, first, last, age FROM Registration";
		      
		   //   ResultSet rs = stmt.executeQuery(sql);
		      
		      
		      
		      
		      String sql = "UPDATE Registration " +  "SET age = 30 WHERE id in (100, 101)";
		      
	     
		      stmt.executeUpdate(sql);

		      
		      //STEP 5: Extract data from result set
		      
		      
		      sql = "SELECT id, first, last, age FROM Registration";
		      
		      ResultSet rs = stmt.executeQuery(sql);

		      
		      while(rs.next()){
		    	  
		         //Retrieve by column name
		    	  
		         int id  = rs.getInt("id");
		         
		         int age = rs.getInt("age");
		         
		         String first = rs.getString("first");
		         
		         String last = rs.getString("last");
		         

		         //Display values
		         
		         System.out.print("ID: " + id);
		         
		         System.out.print(", Age: " + age);
		         
		         System.out.print(", First: " + first);
		         
		         System.out.println(", Last: " + last);
		      }
		      rs.close();
		      		
		   }catch(SQLException se){
			   
		      //Handle errors for JDBC
			   
		      se.printStackTrace();
		      
		   }catch(Exception e){
			   
		      //Handle errors for Class.forName
			   
		      e.printStackTrace();
		      
		   }finally{
			   
		      //finally block used to close resources
			   
		      try{
		    	  
		         if(stmt!=null)
		        	 
		            stmt.close();
		         
		      }catch(SQLException se2){
		      
		      }
		      try{
		    	  
		         if(conn!=null)
		        	 
		            conn.close();
		         
		      }catch(SQLException se){
		    	  
		         se.printStackTrace();
		      }
		   }
		   System.out.println("Goodbye!");
		}
}

