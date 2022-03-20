package com.sqlconnection;

import com.register.information;

public class Updates {
	public static void addUser(information obj1)throws Exception{
		String query="insert into library_Student_Details(name,email,password,mobile,student_Id,student_Dept,student_Year)values('"+obj1.studentName+"','"+obj1.studentEmail+"','"+obj1.studentPassWord+"','"+obj1.studentMobile+"','"+obj1.studentId+"','"+obj1.studentDept+"','"+obj1.studentYear+"')";
		ConnectionSql.sqlConnect(query);
		System.out.println("you are added as our new user");
	}


}
