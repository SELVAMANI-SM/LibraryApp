package com.transtractionProcess;
import java.util.Scanner;

import com.register.RegisterStudent;
public class PaymentTranstraction {
	static Scanner sc1=new Scanner(System.in);
	public static String takeCaptcha1() {
		int a = (int)(Math.random()*(9000-100+1)+100);  
		String b=String.valueOf(a);
		return b;
	}
	public static void Payment()throws Exception
	{
		System.out.println("Welcome to library\nTake more knowledge to train your Brain to be 'Best'");
		System.out.println(" Which categere you need Student or Faculty");
		System.out.println("1. Faculty id");
		System.out.println("2. Student id");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		Student(id);
	}
	public static void Student(int id) throws Exception
	{
		if(id==2)
		{
			
		
				System.out.println("Enter the payment mode");
				System.out.println("1. UPI id");
				System.out.println("2. Debit/Credit card");
				
				int choice=sc1.nextInt();
				if(choice==1) {
					PayOn(choice);
				}
				else if(choice==2) {
					PayOn(choice);
				}
				else 
				{
					System.out.println("Enter valid input");
				}
		}
		else if(id ==1 )
		{
			System.out.println("Enter the payment mode");
			System.out.println("1. UPI id");
			System.out.println("2. Debit/Credit card");
			
			int choice=sc1.nextInt();
			if(choice==1) {
				PayOn1(choice);
			}
			else if(choice==2) {
				PayOn1(choice);
			}
			else 
			{
				System.out.println("Enter valid input");
			}
		}
		else 
			{
				System.out.println("Enter valid input");
			}
		}
		
	
			
			public static void PayOn(int a) throws Exception {
				switch(a) {
					case 1:
							System.out.println("Enter your UPI id:");
							String upi=sc1.next();
								if (!upi.contains("@") || !upi.contains(".")) {
									System.err.println("Invalid UPI");
								
									PayOn(1);
								}
								else {
									
									int capt=captchaVerification();
									if(capt==0) {
//									System.out.println("Paid Successful");
//									RegisterStudent.RegisterProcess(2);
//							
									
								}
								}
								break;
					case 2:
							System.out.println("Enter Debit/Credit Card number");
							String deb=sc1.next();
							sc1.nextLine();
							if(deb.length()==16) {
								
								int capt=captchaVerification();
								if(capt==0) {
									System.out.println("Paid Successful");
//									System.out.println("Returning you to main page");
									//RegisterStudent.RegisterProcess(2);
									
								}
							}
							else {
								System.err.println("Invalid input");
								PayOn(2);
							}
							break;
					
				
				}
			}
			public static void PayOn1(int a) throws Exception {
				switch(a) {
					case 1:
							System.out.println("Enter your UPI id:");
							String upi=sc1.next();
								if (!upi.contains("@") || !upi.contains(".")) {
									System.err.println("Invalid UPI");
								
									PayOn1(1);
								}
								else {
									
									int capt=captchaVerification1();
									if(capt==0) {
//									System.out.println("Paid Successful");
//									RegisterStudent.RegisterProcess(1);
							
									
								}
								}
								break;
					case 2:
							System.out.println("Enter Debit/Credit Card number");
							String deb=sc1.next();
							sc1.nextLine();
							if(deb.length()==16) {
								
								int capt=captchaVerification1();
								if(capt==0) {
									System.out.println("Paid Successful");
//									System.out.println("Returning you to main page");
									//RegisterStudent.RegisterProcess(1);
									
								}
							}
							else {
								System.err.println("Invalid input");
								PayOn1(2);
							}
							break;
					
				
				}
			}
			public static int captchaVerification() throws Exception {
				String captcha=takeCaptcha1();
				System.out.println(captcha);
				System.out.println("Enter the above captcha:");
				String input=sc1.next();
				if(input.equals(captcha)) {
					System.out.println("Paid Successful");
					RegisterStudent.RegisterProcess(2);
					return 0;
				}
				else {
					captchaVerification();
				}
				return 1;
			}
			public static int captchaVerification1() throws Exception {
				String captcha=takeCaptcha1();
				System.out.println(captcha);
				System.out.println("Enter the above captcha:");
				String input=sc1.next();
				if(input.equals(captcha)) {
					System.out.println("Paid Successful");
					RegisterStudent.RegisterProcess(1);
					return 0;
				}
				else {
					captchaVerification();
				}
				return 1;
			}
	}
	

