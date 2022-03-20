package com.booksInformation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import com.register.ConnectionProcess;

public class AdminBooks {

	public static void add() throws Exception {
		@SuppressWarnings("resource")
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter Book_id");
		int bookIdNumber = rm.nextInt();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BooksName");
		String bookName = sc.nextLine();
		System.out.println("Enter dept");
		String deptment = sc.nextLine();
		// System.out.println("Enter Student_Staff");
		// String studentsStaff = sc.nextLine();
		System.out.println("Enter Author");
		String suthors = sc.nextLine();
		System.out.println("Enter Status");
		String specify = sc.nextLine();
		System.out.println("Enter Website Link ");
		String website = sc.nextLine();
		System.out.println("Enter VIdeo link ");
		String video = sc.nextLine();

		String query = "insert into books_library (Book_id,Books_Name,Dept,Author,Status_Book,reference_Website,Reference_Video) values ('"+bookIdNumber+"','"
				+ bookName + "','" + deptment + "','" + suthors + "','" + specify + "','" + website + "','" + video
				+ "')";
		Connection con = ConnectionProcess.databaseconnection();

		Statement st = con.createStatement();
		st.executeUpdate(query);

	}

	public static void delete() throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Using book id & bookName for delete book click 1");
		System.out.println("Using book Author for delete book click 2");
		System.out.println("Using book Dept for delete book click 3");
		// System.out.println("Using boo for delete book click 3");
		int num = sc.nextInt();

		Connection connection = ConnectionProcess.databaseconnection();
		String query = "SELECT Book_id,Books_Name,Dept,Author FROM books_library ORDER BY Book_id";

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);

		switch (num) {
		case 1:
			while (rs.next()) {
				System.out.println(rs.getString("Book_id") + "\t" + rs.getString("Books_Name"));

			}
			System.out.println("Enter book id ");
			int number = sc.nextInt();
			Connection con = ConnectionProcess.databaseconnection();
			String query1 = "DELETE FROM books_library WHERE Book_id ='" + number + "'";
			Statement stm = con.createStatement();
			stm.executeUpdate(query1);
			break;
		case 2:
			while (rs.next()) {
				System.out.println(rs.getString("Author"));

			}
			System.out.println("Enter book Author ");
			sc = new Scanner(System.in);
			String BookAuthor = sc.nextLine();
			Connection conn = ConnectionProcess.databaseconnection();
			String query2 = "DELETE FROM books_library WHERE Author = '" + BookAuthor + "'";

			Statement stt = conn.createStatement();
			stt.executeUpdate(query2);
			break;
		case 3:
			
			System.out.println(" Enter  EEE");
			System.out.println(" Enter  ECE");
			System.out.println(" Enter  CSE");
			System.out.println(" Enter  MECH");
			System.out.println(" Enter  EIE");
			System.out.println(" Enter IT");
			sc = new Scanner(System.in);
			String BookDept = sc.nextLine();
			Connection con3 = ConnectionProcess.databaseconnection();
			String query3 = "DELETE FROM books_library WHERE Dept = '" + BookDept + "'";
			Statement st3 = con3.createStatement();
			st3.executeUpdate(query3);
			break;
		default: {
			System.out.println("Enter only three option");
		}

		}
		

	}

	public static void Student() throws Exception {
		
		String name="null";
		Connection connection = ConnectionProcess.databaseconnection();
		String query1="select student_id,book_id,book_taken_date,book_return_date,book_status from books_register where student_id<>'"+name+"'" ;

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
				System.out.println(rs.getString("student_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

			}
	}

	public static void Faculty() throws Exception {
		String name="null";
		Connection connection = ConnectionProcess.databaseconnection();
		String query1="select staff_id,book_id,book_taken_date,book_return_date,book_status from books_register where staff_id<>'"+name+ "'" ;

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
				System.out.println(rs.getString("staff_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

			}

	}

	public static void NewsPaper() throws Exception {
		
		Scanner sc=new Scanner(System.in);
		LocalDate date=LocalDate.now();
			System.out.println("Enter Indain_news");
			String indianNews = sc.nextLine();
			System.out.println("Enter Hindu_news ");
			String hinduNews = sc.nextLine();
			System.out.println("Enter Dinamalar ");
			String Dinamalar = sc.nextLine();

			String query = "insert into Daily_News_Papers(News_Date,Indian_Express,Hindu,Dinamalar) values ('"+date+"','" + indianNews+ "','" + hinduNews + "','" + Dinamalar + "')";
			Connection con = ConnectionProcess.databaseconnection();

			Statement st1 = con.createStatement();
			st1.executeUpdate(query);
	}


	

}
