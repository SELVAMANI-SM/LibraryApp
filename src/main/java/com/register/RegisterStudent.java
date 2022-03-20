package com.register;

import java.util.Scanner;

import com.login.LoginStudents;
import com.sqlconnection.Updates;
import com.vaildRegisterCheck.StudentCheck;

public class RegisterStudent {
	public static void RegisterProcess(int TypeOfRegister) throws Exception
	{
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		//System.out.println("1--> Register For FACULTY");
		//System.out.println("2--> Register for STUDENTS");
		//int TypeOfRegister = sc.nextInt();
		if(TypeOfRegister == 1) {
			RegisterFaculty.DisplayFaculty();
		}
		else if(TypeOfRegister == 2) {
			displayStudents(2);
		}
		else
		{
			System.out.println("Enter only Given Option");
		}
	}
	public static void displayStudents(int number) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String studentName=sc.nextLine();
		System.out.println("Enter Your Emailwith '.st@' : ");
		String studentEmail=sc.next();
		System.out.println("Enter Your Password : ");
		String studentPassWord=sc.next();
		System.out.println("Enter Your Mobile Number : ");
		String studentMobile=sc.next();
		int num= (int)(Math.random()*(5000-8000+1)+5000);
		System.out.println("Enter Your StudentId here it is : "+num);
		String studentId=sc.next();
		System.out.println("Enter Your studentdept like 'EEE' : ");
		String studentDept=sc.next();
		System.out.println("Enter Your StudentYear like '2001'");
		String studentYear=sc.next();
		information obj1 = new information(studentName,studentEmail,studentPassWord,studentMobile,studentId,studentDept,studentYear);
		//Updates.addUser(obj1);
		int count=0;
		try {
			StudentCheck.StudentNameCheck(obj1);
			StudentCheck.StudentEmailCheck(obj1);
			StudentCheck.StudentPassWordCheck(obj1);
			StudentCheck.StudentMobileCheck(obj1);
			StudentCheck.StudentIdCheck(obj1);
			StudentCheck.StudentDeptCheck(obj1);
			StudentCheck.StudentYearCheck(obj1);
			
		}
		catch(Exception e)
		{
			count++;
			System.out.println("ERROR : " +e.getMessage());
			System.out.println("Register Once Again");
			displayStudents(2);
		}
		if(count==0)
		{
			Updates.addUser(obj1);
	        System.out.println("2--> Sign Up");
			
			@SuppressWarnings("resource")
			Scanner rc= new Scanner(System.in);
			int SignUp = rc.nextInt();
			
			if(SignUp == 2)
			{
				LoginStudents.DisplayStudent(1);
			}
			else
			{
				System.out.println("Enter only Given Option");
			}
		}
		

}
}