package com.sqlconnection;
import com.register.StaffDetails;

	public class StaffUpdate {
		public static void addUser(StaffDetails obj)throws Exception{
			String query="insert into Library_Staff(name,email,password,mobile,staff_Id)values('"+obj.staffName+"','"+obj.staffEmail+"','"+obj.staffPassWord+"','"+obj.staffMobile+"','"+obj.staffId+"')";
			ConnectionSql.sqlConnect(query);
			System.out.println("you are added as our new user");
		}


	}

