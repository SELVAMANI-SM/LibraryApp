package com.updateDeleteTakeReturnBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.booksInformation.FacultyBooks;
import com.booksInformation.StudentBooks;
import com.register.ConnectionProcess;

public class StudentsProcess {
	public static void Students(int student_Id) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//String valuable="Available";
		Connection connectionn = ConnectionProcess.databaseconnection();
		String query1 = "SELECT Book_id,Books_Name,Status_Book FROM books_library ";
		Statement stm = connectionn.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                       ------->          \t" +rsm.getString("Status_book"));

		}
		
		String value="not return";
		Connection connection=ConnectionProcess.databaseconnection();
		String query = "SELECT * FROM books_register WHERE book_status='"+value+"' and student_id='"+student_Id+"' ";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		
		
		if(rs.next())
		{
			System.out.println("2. Return book");
			System.out.println("3. ReferenceWebsite");
			System.out.println("4. ReferenceVideo");
			System.out.println("5. Today NewsPaper");
			int number=sc.nextInt();
			
			
			 if(number==2)
			StudentBooks.ReturnBook();
			else if(number==3)
			{
				Scanner sc2 = new Scanner(System.in);
				System.out.println("how many book Website you need like--->'2 or 3' but max = '10'only");
				int number2 = sc2.nextInt();
				for(int i=number2;i<=10;i++)
				{
					StudentBooks.ReferenceWebsite();
				}
				System.out.println("Thank you");
			}
			
			else if(number==4)
			{
				Scanner sc1 = new Scanner(System.in);
				System.out.println("how many book tutorial  you need like--->'2 or 3' but max = '5'only");
				int number1 = sc1.nextInt();
				for(int i=number1;i<=5;i++)
				{
					StudentBooks.ReferenceVideo();
				}
				System.out.println("Thank you");

			}
			else if(number==5)
			{
				FacultyBooks.TodayNews();
			}
			
			
		}
		else {
		
		
		System.out.println("1. TakeBook");
		System.out.println("3. ReferenceWebsite");
		System.out.println("4. ReferenceVideo");
		System.out.println("5. Today NewsPaper");
		int Student=student_Id;
		int number=sc.nextInt();
		if(number==1)
		StudentBooks.TakeBook(Student);
		
		else if(number==3)
		{
			Scanner sc2 = new Scanner(System.in);
		System.out.println("how many book Website you need like--->'2 or 3' but max = '5'only");
		int number2 = sc2.nextInt();
		for(int i=number2;i<=10;i++)
		{
			StudentBooks.ReferenceWebsite();
		}
		System.out.println("Thank you");
		}
		else if(number==4)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("how many book tutorial  you need like--->'2 or 3' but max = '5'only");
		int number1 = sc1.nextInt();
		for(int i=number1;i<=5;i++)
		{
			StudentBooks.ReferenceVideo();
		}
		System.out.println("Thank you");

		
		
		}
		else if(number==5)
		{
			FacultyBooks.TodayNews();
		}
		
	}
	}
}


