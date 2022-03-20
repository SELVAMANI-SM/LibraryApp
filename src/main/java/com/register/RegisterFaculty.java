package com.register;
import java.util.Scanner;

import com.login.LoginAdmin;
import com.login.LoginFaculty;
import com.login.LoginStudents;
import com.sqlconnection.StaffUpdate;
import com.vaildRegisterCheck.FacultyCheck;

public class RegisterFaculty {
	public static void RegisterProcess() throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("1--> Sign in FACULTY");
		System.out.println("2--> Sign in STUDENTS");
		System.out.println("3--> Sign in ADMIN");
		int SignUp = sc.nextInt();
		if(SignUp == 1)
		{
			LoginFaculty.DisplayFaculty(1);
		}
		else if(SignUp == 2)
		{
			LoginStudents.DisplayStudent(1);
		}
		else if(SignUp == 3)
		{
			LoginAdmin.DisplayAdmin(1);
		}
		else
		{
			System.out.println("Enter only Given Option");
		}
	}
	public static void DisplayFaculty() throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String staffName=sc.nextLine();
		System.out.println("Enter Your Emailwith '.ft@' : ");
		String staffEmail=sc.next();
		System.out.println("Enter Your Password : ");
		String staffPassWord=sc.next();
		System.out.println("Enter Your Mobile Number : ");
		String staffMobile=sc.next();
		int num= (int)(Math.random()*(50000-89998+1)+40000);
		System.out.println("Enter Your StaffId here it is--> : " +num);
		String staffId=sc.next();
		StaffDetails obj = new StaffDetails(staffName,staffEmail,staffPassWord,staffMobile,staffId);
		//StaffUpdate.addUser(obj);
		int count=0;
		try {
			FacultyCheck.StaffNameCheck(obj);
			FacultyCheck.StaffEmailCheck(obj);
			FacultyCheck.StaffPassWordCheck(obj);
			FacultyCheck.StaffMobileCheck(obj);
			FacultyCheck.StaffIdCheck(obj); 
			
			
		}
		catch(Exception e)
		{
			count++;
			
			System.out.println("ERROR : " +e.getMessage());
			System.out.println("Register Once Again");
			DisplayFaculty();
		}
		if(count==0)
		{
			StaffUpdate.addUser(obj);
		
			System.out.println("1--> Sign in");
			
			@SuppressWarnings("resource")
			Scanner rc = new Scanner(System.in);
			int SignUp = rc.nextInt();
			if(SignUp == 1)
			{
				LoginFaculty.DisplayFaculty(1);
			}
			
			else
			{
				System.out.println("Enter only Given Option");
			}
			
		}
		
	}
	

}
