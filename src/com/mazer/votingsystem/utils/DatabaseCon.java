package com.mazer.votingsystem.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DatabaseCon {

	public void createdatabase() {
		try {
	
		String url="jdbc:mysql://localhost:3306/voterid";
		 String username="root";
		 String password="root";
		 
		Connection conn=DriverManager.getConnection(url,username,password);
		Statement stm=conn.createStatement();
		
		
		String query="create database voterl";
		  stm.execute(query);
		 System.out.println("connected successfully:-");
		 conn.close();
	}
	
	catch(Exception e) {
		e.printStackTrace();
	
	
	}
    
}	
    	
     public void createTable() {
		try {
			String url="jdbc:mysql://localhost:3306/voter";
			 String username="root";
			 String password="root";
			 
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement stm=conn.createStatement();
			
			
			String query="create table gh(name char(52),roll int)";
			  stm.execute(query);
			 System.out.println("table created successfully:-");
			 conn.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		
		
		}
		
	}

	public void createData() {
		try {
			String url="jdbc:mysql://localhost:3306/";
			String gg="voter";
			 String username="root";
			 String password="root";
			 
			Connection conn=DriverManager.getConnection(url+gg,username,password);
			String query="insert into gh(name,roll) values (?,?)";
			
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setString(1,"bharat");
			pstm.setInt(2,3);
			
			
			
			  pstm.execute();
			 System.out.println("value inserted successfully:-");
			 conn.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		
		
		}
		
	}

	public void readData() {

		try {
			String url="jdbc:mysql://localhost:3306/";
			String gg="voter";
			 String username="root";
			 String password="root";
			 
			Connection conn=DriverManager.getConnection(url+gg,username,password);
			String query="Select * from gh";
			
			Statement stm=conn.createStatement();
			
			
			
			
			
			 ResultSet rs= stm.executeQuery(query);
			 while(rs.next()) {
				 System.out.println("roll="+rs.getInt(2));
				 System.out.println("name="+ rs.getString(1));
			 }
			 System.out.println("read successfully:-");
			 conn.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		
		
		}
		
	}

	public void updateData() {
		try {
			String url="jdbc:mysql://localhost:3306/";
			String gg="voter";
			 String username="root";
			 String password="root";
			 
			Connection conn=DriverManager.getConnection(url+gg,username,password);
			String query="Select * from gh";
			
			Statement stm=conn.createStatement();
			
			
			
			
			
			 ResultSet rs= stm.executeQuery(query);
			 while(rs.next()) {
				 System.out.println("roll="+rs.getInt(2));
				 System.out.println("name="+ rs.getString(1));
			 }
			 System.out.println("read successfully:-");
			 conn.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		
		
		}
		
		
	}
	public static void main(String args[])
	{
		DatabaseCon st= new DatabaseCon();
		st.createdatabase();
//		st.createTable();
//		st.createData();
//		st.readData();
//		st.updateData();
		
	}
	}