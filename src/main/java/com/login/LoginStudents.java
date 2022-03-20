package com.login;

import java.util.Scanner;


import com.validationCheck.LoginVaildForAll;

public class LoginStudents {
	public static void DisplayStudent(int num)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gmail Id / Student_id number");
		String checkEmail=sc.next();
		System.out.println("Enter your password ");
		String checkPassWord=sc.next();
		try {
			LoginVaildForAll.loginValidator(checkEmail, checkPassWord);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
			DisplayStudent(1);
		}
	}

	
}
