package com.login;

import java.util.Scanner;

//import com.sqlconnection.VerificationAdmin;
import com.validationCheck.LoginVaildForAll;

public class LoginAdmin {
	public static void DisplayAdmin(int num)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gmail Id / Admin_id ");
		String checkAEmail=sc.next();
		
		System.out.println("Enter your password ");
		String checkAPassWord=sc.next();
		try {
			LoginVaildForAll.AdminValidator(checkAEmail, checkAPassWord);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
			DisplayAdmin(1);
		}
	}

}
