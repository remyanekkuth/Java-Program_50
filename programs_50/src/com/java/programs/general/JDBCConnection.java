package com.java.programs.general;

public class JDBCConnection {

	
	 static
	    {
	        //STEP 1 : Registering The Driver Class
	 
	        try
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        }
	        catch (ClassNotFoundException e)
	        {
	            System.out.println("Unable To Load The Driver class");
	        }
	    }
	 
}
