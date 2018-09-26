package Assignment7;

import java.sql.Date;

public class Order {
	private String orderId;
	private String orderDetails;
	private Date orderDate;
	public Order(String i,String d,Date date)
	{
		orderId=i;
		orderDetails=d;
		orderDate=date;
		try
		{
			if((orderId.length()<3) || (orderId.charAt(0)!='O'))
			throw new OrderNotValidException();
		}
		catch(OrderNotValidException e)
		{
			e.getMessage();
		}
		
			
	}
	public String toString()
	{
		return "[Order Id : "+orderId+" , orderDetails : "+orderDetails+" ,date="+orderDate+" ]";
	}

}
