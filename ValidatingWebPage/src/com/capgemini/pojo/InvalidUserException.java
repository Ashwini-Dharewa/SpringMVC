package com.capgemini.pojo;

public class InvalidUserException extends Exception{
	public InvalidUserException ()
	{
		System.out.println("Entered User does not exist!!");
	}

}
