package com.testcases;
import java.util.Scanner;
import com.register.*;
import com.transtractionProcess.PaymentTranstraction;
import com.helpUsAndContactAndAbout.AboutLibrary;
import com.helpUsAndContactAndAbout.ContactUs;
import com.helpUsAndContactAndAbout.HelpUs;

public class Library {

	public static void main(String[] args) throws Exception {
	BackLogout();
		
	}
		
	public static void BackLogout() throws Exception{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome.....!! to   LIBRARY");
			System.out.println("1--> Register / Sign up");
			System.out.println("2--> Login / sign in");
			System.out.println("3--> contact us");
			System.out.println("4--> Help");
			System.out.println("5--> About Library ");
			System.out.println("6--> logout ");
			
			int Register = sc.nextInt();
		if(Register == 1)
		{
			PaymentTranstraction.Payment();
		}
		else if(Register == 2)
		{
			RegisterFaculty.RegisterProcess();
		}
		else if(Register ==3)
		{
			ContactUs.contact();
			 BackLogout();
		}
		else if (Register == 4)
		{
			HelpUs.help();
			 BackLogout();
		}
		else if (Register == 5)
		{
			AboutLibrary.Library();
			 BackLogout();
			
		}
		else if(Register ==6)
		{
			System.out.println("Your are successlly logout ");
		}
		else
		{
			System.out.println("Enter only the displaying Option");
		}
	}
	
}



	
	


	


