package Assignment5;

public class Television {
	String company;
	String type;
	boolean enable;
	double price;
	public Television(String c,String m,boolean b,double p)
	{
		company=c;
		type=m;
		enable=b;
		price=p;
	}
	public boolean equals(Television b)
	{
		if((this.company.equals(b.company)) && (this.type.equals(b.type)))
			return true;
		return false;
	}
	public int hashCode()
	{
		int p=(int)price;
		return p;
	}
	public String toString()
	{
		return "Television Details: "+company+" , "+type+" ,Enable= "+enable+" , "+price;
	}
	

}


