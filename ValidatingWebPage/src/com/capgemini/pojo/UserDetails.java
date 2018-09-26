package com.capgemini.pojo;

import java.util.ArrayList;

public class UserDetails {
	private static ArrayList<UserDetails> userDetailsList;
	String userName;
	String password;
	String type;
	public UserDetails(String name, String password, String type) {
		this.userName = name;
		this.password = password;
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static ArrayList<UserDetails> getUserDetailsList()
	{
		userDetailsList=new ArrayList<>();
		return userDetailsList;
	}

}
