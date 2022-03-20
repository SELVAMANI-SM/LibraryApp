package com.booksInformation;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.register.ConnectionProcess;

@SuppressWarnings("unused")
public class StudentBooks {
	
	public static void TakeBook(int student) throws Exception
	{
		
		String name="Unavailable";
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter book id");
		int name1 = sc.nextInt();
		String query1="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
		Connection con = ConnectionProcess.databaseconnection();
		Statement stm = con.createStatement();
		stm.executeUpdate(query1);
		System.out.println("yeah success fully taken");
		addId(student,name1);
		
		}
	public static void addId(int student,int name1) throws Exception
	{
		String name2="not return";
		LocalDate date=LocalDate.now();
		String query1="insert into book_register (student_id,book_id,book_taken_date,book_status)values('"+student+"','"+name1+"','"+date+"','"+name2+"')" ;
		Connection con = ConnectionProcess.databaseconnection();
		Statement stm = con.createStatement();
		stm.executeUpdate(query1);
		System.out.println("Thank you");
	}
		
		public static void ReturnBook() throws Exception
	  {
		
		
		String name="Available";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter book_id ");
		int name1 = sc.nextInt();
		String query2="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
		Connection con = ConnectionProcess.databaseconnection();
		Statement stm = con.createStatement();
		stm.executeUpdate(query2);
		System.out.println("yeah success fully Return");
		Return(name1);
	}
		public static void Return(int name1) throws Exception
		{
			String name2="return";
			LocalDate date=LocalDate.now();
			String query1="update book_register set book_status='"+name2+"' , book_return_date ='"+date+"' where book_id='"+name1+"' ";
			Connection con = ConnectionProcess.databaseconnection();
			Statement stm = con.createStatement();
			stm.executeUpdate(query1);
			System.out.println("Thank you");
		}
	public static void ReferenceWebsite() throws Exception 
	{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter booK_id ");
			int  number1=sc.nextInt();
			Connection connectionn = ConnectionProcess.databaseconnection();
			String query1 = "SELECT Reference_Website FROM books_library where Book_id = '"+ number1+"'";
			Statement stm = connectionn.createStatement();
			ResultSet rst = ((java.sql.Statement) stm).executeQuery(query1);
			while (rst.next()) {
				System.out.println(rst.getString("Reference_Website"));
			
			}
			System.out.println("Take your book Website");
			//System.out.println("Thank you");
	}
	public static void ReferenceVideo() throws Exception 
	{
	
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter book id");
			int number1=sc.nextInt();
			Connection connectionn = ConnectionProcess.databaseconnection();
			String query1 = "SELECT Reference_Video FROM books_library where Book_id = '"+ number1+"'";
			Statement st = connectionn.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				System.out.println(rs.getString("Reference_Video"));
	}
			System.out.println("Take your book video");
			//System.out.println("Thank you");
	}
	
	}
	
	
	
	
	

	


