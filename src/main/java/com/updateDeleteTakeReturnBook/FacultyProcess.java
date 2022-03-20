package com.updateDeleteTakeReturnBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.booksInformation.FacultyBooks;
import com.register.ConnectionProcess;

public class FacultyProcess {
	public static void Faculty(int faculty) throws Exception{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//String valuable="Available";
		Connection connectionn = ConnectionProcess.databaseconnection();
		String query1 = "SELECT Book_id,Books_Name,Status_Book FROM books_library";
		Statement stm = connectionn.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                ------->          \t" +rsm.getString("Status_book"));

		}
		String value="not return";
		Connection connection=ConnectionProcess.databaseconnection();
		String query = "SELECT * FROM books_register WHERE book_status='"+value+"' and staff_id='"+faculty+"' ";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		
		int count=0;
		
		while(rs.next())
		{
			count++;
		}
		int number2= 5-count;
		System.out.println("You have "+ number2+" chance to take book");
		int number1=count;
		System.out.println("You want to return "+ count +"  book");
		//int takeBook=sc.nextInt();
		System.out.println("1. TakeBook");
		System.out.println("2. Return book");
		System.out.println("3. ReferenceWebsite");
		System.out.println("4. ReferenceVideo");
		int number=sc.nextInt();
		if(number==1)
		Addbook(faculty,number2);
		else if(number==2)
		returnbook(faculty,number1);
		else if(number==3)
		Website();
		else if(number==4)
		video();
		else if(number==5)
			FacultyBooks.TodayNews();
		
			
	}
		
	
	

	public static void Addbook(int faculty,int sum) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("how many Take-book you need like--->'2 or 3'");
		
     	int num = sc.nextInt();
     	int number2=sum;
     	

     	int number=number2-num;
        if(sum==0)
		{
			System.out.println("Sry you can't take book ..... you must return atlest one book ");
		}
		else if (number<0)
		{
			System.out.println("Sry you can't take book more than ..... "+number2);
		}
		else
		{
			for(int i=num;i>=1;i--)
			{
				FacultyBooks.TakeBook(faculty);
			}
			System.out.println("Thank you");
		}
		
		
	}
	public static void returnbook(int faculty,int count) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("how many book you want return like--->'2 or 3'");
		int number = sc.nextInt();
		int number1=count-number;
		
		if(count==0)
		{
			System.out.println("Sry you can't return book ..... you must take atleast one book");
		}
		else if(number1<0)
		{
			System.out.println("Sry you can't return book more than...."+count);
		}
		else
			{
			for(int i=number1;i<count;i++)
			{
				FacultyBooks.ReturnBook(faculty);
			}
			System.out.println("Thank you");
			}
		
		
	}
	public static void Website() throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("how many book Website you need like--->'2 or 3' but max = '10'only");
		int number = sc.nextInt();
		for(int i=number;i<=10;i++)
		{
			FacultyBooks.ReferenceWebsite();
		}
		System.out.println("Thank you");
	}
	public static void video() throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("how many book tutorial  you need like--->'2 or 3' but max = '10'only");
		int number = sc.nextInt();
		for(int i=number;i<=10;i++)
		{
			FacultyBooks.ReferenceVideo();
		}
		System.out.println("Thank you");

	}
}


