package Assignment5;




public class Car {
	String make;
	String model;
	int year;
	double price;
	//Set s=new HashSet();
	public boolean equals(Car b)
	{
		if((this.make.equals(b.make)) && (this.model.equals(b.model)) )
			return true;
		return false;
	}
	
	public Car(String c,String m,int y,double p)
	{
		make=c;
		model=m;
		year=y;
		price=p;
	}
	public String toString()
	{
		return "Car Details: "+make+" , "+model+" , "+year+" , "+price;
	}


}
