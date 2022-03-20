package com.login;

import java.util.Scanner;


import com.validationCheck.LoginVaildForAll;

public class LoginFaculty {
public static void DisplayFaculty(int num)
{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Gmail Id / Faculty_id ");
	String checkSEmail=sc.next();
	
	System.out.println("Enter your password ");
	String checkSPassWord=sc.next();
	try {
		LoginVaildForAll.FacultyValidator(checkSEmail, checkSPassWord);
	}
	catch(Exception e)
	{
		System.out.println( e.getMessage());
		DisplayFaculty(1);
	}
}
}
