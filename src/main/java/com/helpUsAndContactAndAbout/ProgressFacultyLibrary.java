package com.helpUsAndContactAndAbout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.register.ConnectionProcess;

public class ProgressFacultyLibrary {
	public static void Faculty(int faculty) throws Exception
	{
		Connection connectionn = ConnectionProcess.databaseconnection();
		String query1 = "SELECT staff_id,book_id,book_taken_date,book_return_date,book_status FROM books_register WHERE staff_id='"+faculty+"'";
		Statement stm = connectionn.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("staff_id")+"\t"+rsm.getString("book_id")+ "\t" + rsm.getString("book_Taken_date")+"\t"+rsm.getString("book_return_date")+"\t"+rsm.getString("book_status"));

		}
	}

	

}
