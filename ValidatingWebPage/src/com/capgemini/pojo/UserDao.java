package com.capgemini.pojo;
import java.util.*;
public class UserDao {
	ArrayList<UserDetails> userDetailsList=null;
	public UserDao()
	{
		userDetailsList=UserDetails.getUserDetailsList();
		userDetailsList.add(new UserDetails("Ashwini","ash12","Admin"));
		userDetailsList.add(new UserDetails("Swagata","swag23","Admin"));
		userDetailsList.add(new UserDetails("Tanusree","tan34","User"));
		userDetailsList.add(new UserDetails("Riya","ri45","User"));
		userDetailsList.add(new UserDetails("Abhrak","ab56","User"));
		userDetailsList.add(new UserDetails("Angshuman","an67","User"));
		userDetailsList.add(new UserDetails("Sanu","san78","User"));
	}
	public String getUserType(String userName,String password)throws InvalidUserException
	{
		for(UserDetails user: userDetailsList)
		{
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getType();
			}
		}
		return "invalid";
	}

}
