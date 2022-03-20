package com.validationCheck;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.register.ConnectionProcess;
import com.updateDeleteTakeReturnBook.AdminProcess;
import com.updateDeleteTakeReturnBook.FacultyProcess;
import com.updateDeleteTakeReturnBook.StudentsProcess;

public class LoginVaildForAll{
	
		public static  void loginValidator(String email,String password) throws Exception
		{
		Connection connection=ConnectionProcess.databaseconnection();
		String query = "SELECT email,Password,student_Id FROM library_Student_Details WHERE email='"+email+"'or  student_Id='"+email+"' ";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		String mail = null;
		String Password=null;
		int student_Id= 0;
		String number=null;
		while(rs.next())
		{
		mail=rs.getString("email");
		Password=rs.getString("Password");
		student_Id=rs.getInt("student_Id");
		number=rs.getString("student_Id");
		
		}
		if(mail==null||number==null)
		{
		throw new Exception("No Records Found");
		}
		
		else if(Password.equals(password))
		{
			System.out.println("Successfully login");
			StudentsProcess.Students(student_Id);
		
		}
		
		else
		{
		throw new Exception("Invalid Credentials");
		}
		}

		public static  String FacultyValidator(String email,String password) throws Exception
		{
		Connection connection=ConnectionProcess.databaseconnection();
		String query = "SELECT email,Password,Staff_Id FROM Library_Staff WHERE email='"+email+"' or Staff_Id='"+email+"'";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		String number=null;

		String mail = null;
		String Password=null;
		int Faculty=0;
		while(rs.next())
		{
		mail=rs.getString("email");
		Password=rs.getString("Password");
		Faculty=rs.getInt("Staff_Id");
		number=rs.getString("Staff_Id");
		}
		if(mail==null||number==null)
		{
		throw new Exception("No Records Found");
		}
		else if(Password.equals(password))
		{
			System.out.println("Successfully login");
			FacultyProcess.Faculty(Faculty);
			return mail;
		}
		
		else
		{
		throw new Exception("Invalid Credentials");
		}
		}

		public static  String AdminValidator(String email,String password) throws Exception
		{
		Connection connection=ConnectionProcess.databaseconnection();
		String query = "SELECT email,Password,admin_id FROM Admin_Login WHERE email='"+email+"' or admin_id='"+email+"'" ;
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		String mail = null;
		String Password=null;
		String number=null;
		while(rs.next())
		{
		mail=rs.getString("email");
		Password=rs.getString("Password");
		number=rs.getString("admin_id");
		}
		if(mail==null||number==null)
		{
		throw new Exception("No Records Found");
		}
		else if(Password.equals(password))
		{
			System.out.println("Successfully login");
			AdminProcess.Admin();
			return mail;
		}
		
		else
		{
		throw new Exception("Invalid Credentials");
		}
		}
		
}

