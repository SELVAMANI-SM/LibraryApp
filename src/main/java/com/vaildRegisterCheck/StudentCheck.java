package com.vaildRegisterCheck;

import com.register.information;

public class StudentCheck {
	static int count=0;
	public static void StudentNameCheck(information obj1) throws Exception
	{
		if(obj1.studentName==null)
		throw new Exception("Enter Vaild Name");
		else
			count++;
		
	}
	public static void StudentEmailCheck(information obj1) throws Exception
	{
		if(!obj1.studentEmail.contains(".st@"))
		throw new Exception("Enter Vaild Email");
		else
			
		count++;
		
	}
	public static void StudentPassWordCheck(information obj1) throws Exception
	{
		if(obj1.studentPassWord.length()<8 || obj1.studentPassWord.length()>16)
		throw new Exception("Enter Vaild PassWord");
		else
			count++;
		
	}
	public static void StudentMobileCheck(information obj1) throws Exception
	{
	int count1=0;
		char[] mobile=obj1.studentMobile.toCharArray();
		if(obj1.studentMobile.length()>10||obj1.studentMobile.length()<10)
		{
			
		throw new Exception("Enter Only 10 Number ");
		
		}
		else
			count1++;
		for(char i:mobile)
		{
			if(Character.isAlphabetic(i))
			{
				//count++;
				throw new Exception("Enter Only Numeric Value");
				
				
			}
			else
				count1++;
		
		}
		if(count1==11)
		{
			count++;
		}
		
		
	}
	public static void StudentIdCheck(information obj1) throws Exception
	{
		if(obj1.studentId==null)
		throw new Exception("Enter Vaild Id");
		else
			count++;
	}
	public static void StudentDeptCheck(information obj1) throws Exception
	{
		if(obj1.studentDept==null)
		throw new Exception("Enter Vaild Dept");
		else
			count++;
	}
	public static void StudentYearCheck(information obj1) throws Exception
	{
		if(obj1.studentYear.length()<4||obj1.studentYear.length()>4)
		throw new Exception("Enter Vaild Year");
		else
			count++;
	
	
	if(count==7)
	{
		System.out.println("Registration is Completed .....  Welcome");
		
		
	}
	else
		System.out.println("Once again Register ");
}
}
	
			
