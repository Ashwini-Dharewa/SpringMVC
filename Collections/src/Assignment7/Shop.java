package Assignment7;

import java.sql.Date;

public class Shop {

	public static void main(String[] args) {
		Date d=new Date(2011,11,11);
		Order o=new Order("O123","Delivery",d);
		Customer c=new Customer(12,"Ashwini");
		MyShopping ob=new MyShopping(o,c);
		//ob.storeRecord("records.dat");
		//ob.getRecord("records.dat");
		ob.display();
		
		

	}

}
