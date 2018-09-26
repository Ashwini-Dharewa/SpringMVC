package Assignment7;

public class Customer {
	private int custNo;
	private String custName;
	public Customer(int n,String name)
	{
		custNo=n;
		custName=name;
	}
	public String toString()
	{
		return "[Customer name : "+custName+" , Customer Number : "+custNo+"]";
	}

}
