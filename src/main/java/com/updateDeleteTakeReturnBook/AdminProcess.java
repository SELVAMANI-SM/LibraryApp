package com.updateDeleteTakeReturnBook;

import java.util.Scanner;

import com.booksInformation.AdminBooks;

public class AdminProcess {
	public static void Admin() throws Exception {
		System.out.println("1. Add book in libray");
		System.out.println("2. Delete book in library");
		System.out.println("3. Display the process Student");
		System.out.println("4. Display the process Faculty");
		System.out.println("5. Add news Paper");
		System.out.println("6. Logout process");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int click =sc.nextInt();
		switch(click)
		{
		case 1:
			AdminBooks.add();
			System.out.println("success in  updated books");
			System.out.println("Enter how many Book to insert -->digites");
			System.out.println("7---> to Finish");
			int sum = sc.nextInt();
			if(sum==7)
			{
			
			}
			else
			{
				for(int i=0;i<sum;i++)
				{
					AdminBooks.add();
					System.out.println("success in  updated books");
				}
				AdminProcess.Admin();
			}
			break;
		case 2:
			AdminBooks.delete();
			System.out.println("success in delete books");
			AdminProcess.Admin();
			break;
		case 3:
			AdminBooks.Student();
			System.out.println("Here it is about the process of students");
			AdminProcess.Admin();
			break;
		case 4:
			AdminBooks.Faculty();
			System.out.println("Here it is about the process of faculty");
			AdminProcess.Admin();
			break;
		case 5:
			AdminBooks.NewsPaper();
			System.out.println(" yeah Completd ");
			AdminProcess.Admin();
			break;
		case 6:
			
			System.out.println("Ok!! the process is completed");
			break;
	
		

		}
	}

}
