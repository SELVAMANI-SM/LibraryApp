package com.vaildRegisterCheck;

import com.register.StaffDetails;

public class FacultyCheck {
	static int count=0;

	public static void StaffNameCheck(StaffDetails obj)throws Exception
	{
		if(obj.staffName==null)
		throw new Exception("Enter Vaild Name");
		else
			count++;
	}
	public static void StaffEmailCheck(StaffDetails obj) throws Exception
	{
		if(!obj.staffEmail.contains(".ft@"))
			throw new Exception("Enter Vaild Email");
		else
			count++;
	}
	public static void StaffPassWordCheck(StaffDetails obj) throws Exception
	{
		if(obj.staffPassWord.length()<8 || obj.staffPassWord.length()>16)
		throw new Exception("Enter Vaild PassWord");
		else
			count++;
	}
	public static void StaffMobileCheck(StaffDetails obj) throws Exception
	{
	int count1=0;
		char[] mobile=obj.staffMobile.toCharArray();
		if(obj.staffMobile.length()>10||obj.staffMobile.length()<10)
		{
			throw new Exception("Enter Only 10 Number ");
		}
		else
			count1++;
		for(char i:mobile)
		{
			if(Character.isAlphabetic(i))
			{
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
	public static void StaffIdCheck(StaffDetails obj) throws Exception
	{
		if(obj.staffId==null)
		throw new Exception("Enter Vaild Id");
		else
			count++;
		if(count==5)
		{
			System.out.println("Registration Completed ... Welcome ");
			
		}
		else
		{
			System.out.println("Once again Register");
		}
	}
}

