package com.capgemini.pojo;

import java.util.ArrayList;

public class AdminOperations {
	private static ArrayList<AdminOperations> cart;
	String productID;
	String productName;
	double productPrice;
	public AdminOperations()
	{
		
	}
	public AdminOperations(String productID, String productName,double productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public static ArrayList<AdminOperations> getAdminOperations()
	{
		cart=new ArrayList<>();
		return cart;
	}

}