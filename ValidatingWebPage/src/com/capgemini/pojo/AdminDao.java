package com.capgemini.pojo;
import java.util.*;
public class AdminDao {
	ArrayList<AdminOperations> cartDetails=null;
	public AdminDao()
	{
		cartDetails=AdminOperations.getAdminOperations();
		cartDetails.add(new AdminOperations("c1","car",1234.5));
		cartDetails.add(new AdminOperations("l1","laptop",2190.5));
		cartDetails.add(new AdminOperations("h1","house",11000.9));
		cartDetails.add(new AdminOperations("b1","bus",2349.8));
	}
	public void adminAdd(String pID, String pName,double pPrice)
	{
		cartDetails.add(new AdminOperations(pID,pName,pPrice));
	}
	public int adminDelete(String pID)
	{
		for(AdminOperations deleteId:cartDetails)
		{
			if(deleteId.getProductID().equals(pID)){
				cartDetails.remove(deleteId);
				return 1;
			}				
		}
		return -1;
	}
	public String adminRetrieve(String pID)
	{
		for(AdminOperations retrieveId:cartDetails)
		{
			if(retrieveId.getProductID().equals(pID)){
				return "Product name : "+retrieveId.getProductName()+"  , Product price : "+retrieveId.getProductPrice();
			}				
		}
		return "Element not found!!";
	}

}
