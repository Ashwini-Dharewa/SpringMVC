package EigthActivity;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String cno,String name,String cat)
	{
		custNo=cno;
		custName=name;
		category=cat;
		try
		{
			if((((custNo.charAt(0))=='C')|| ((custNo.charAt(0))=='c')) && (custName.length()>=4) && ((category.equals("Platinum")) || (category.equals("Gold")) || (category.equals("Silver"))) )
				System.out.println("Customer details:\nCustomer Number: "+custNo+"\nCustomer Name: "+custName+"\nCategory: "+category);
			else
				throw new InvalidInputException();
			
		}
		catch(InvalidInputException e)
		{
			e.getMessage();
		}
	}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}	
	public String getCategory() {
		return category;
	}
	
	
	

}
