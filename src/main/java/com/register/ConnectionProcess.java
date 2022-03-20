package com.register;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProcess {
	public static Connection databaseconnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		return connect;
	}

}
