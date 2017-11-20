package com.ach_services.eclipselink.entity;

import java.sql.*;

public class Jdemo {

	public static void main(String[] args) {

	      Connection connection = null;
	      try {                  
	         connection = DriverManager.getConnection(
	            "jdbc:sap://hxehost:39015/?autocommit=false","IDM_ACE_DEVELOPER","Gmc12084592715!!");                  
	      } catch (SQLException e) {
	         System.err.println("Connection Failed. User/Passwd Error?");
	         return;
	      }
	      if (connection != null) {
	         try {
	            System.out.println("Connection to HANA successful!");
	            Statement stmt = connection.createStatement();
//	            ResultSet resultSet = stmt.executeQuery("Select 'hello world' from dummy");
	            ResultSet resultSet = stmt.executeQuery("SELECT TOP 1000 * FROM IDM_PROTOTYPE.AESIP_APPLICATION");
	
	            while ( resultSet.next() ) {
	            	
		            String hello = resultSet.getString(1) + "  " + resultSet.getString(2) + 
		            		"  " + resultSet.getString(3);
		            System.out.println(hello);
	            	
	            }
//	            resultSet.next();
//	            String hello = resultSet.getString(1) + "  " + resultSet.getString(2) + 
//	            		"  " + resultSet.getString(3);
//	            System.out.println(hello);
	            
	            
	       } catch (SQLException e) {
	          System.err.println("Query failed!");
	       }
	       finally {
	    	   
	    	   if (connection != null) {
	    		   
	    		   try {
					connection.close();
					
				} catch (Exception e2) {

				}
	    	   }
	       }
	     }
	   }

}
