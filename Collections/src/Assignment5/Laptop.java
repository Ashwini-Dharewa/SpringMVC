package Assignment5;




public class Laptop {
	String company;
	String model;
	String os;
	String processor;
	int year;
	double price;
	//Set s=new HashSet();
	public boolean equals(Laptop b)
	{
		if((this.company.equals(b.company)) && (this.model.equals(b.model)) )
			return true;
		return false;
	}
	public Laptop(String c,String m,String o,String p)
	{
		company=c;
		model=m;
		os=o;
		processor=p;
	}
	public String toString()
	{
		return "Laptop Details: "+company+" , "+model+" , "+processor+" , "+os+" , "+price+" , "+year;
	}

}
