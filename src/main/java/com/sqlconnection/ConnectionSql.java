package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionSql{
		public static void sqlConnect(String runquery) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			System.out.println("Connection established:"+connect);
			Statement run=connect.createStatement();
			@SuppressWarnings("unused")
			int rows=run.executeUpdate(runquery);
					//	System.out.println("You are added as our new user");
		}

}