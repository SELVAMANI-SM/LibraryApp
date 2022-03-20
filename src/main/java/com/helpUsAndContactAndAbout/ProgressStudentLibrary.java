package com.helpUsAndContactAndAbout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.register.ConnectionProcess;

public class ProgressStudentLibrary {
	public static void Student(int student) throws Exception
	{
		Connection connectionn = ConnectionProcess.databaseconnection();
		String query1 = "SELECT student_id,book_id,book_taken_date,book_return_date,book_status FROM books_register WHERE staff_id='"+student+"'";
		Statement stm = connectionn.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("student_id")+"\t"+rsm.getString("book_id")+ "\t" + rsm.getString("book_Taken_date")+"\t"+rsm.getString("book_return_date")+"\t"+rsm.getString("book_status"));

	}

}
}
