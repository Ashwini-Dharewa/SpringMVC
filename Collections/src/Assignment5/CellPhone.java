package Assignment5;




public class CellPhone {
	String company;
	String type;
	String desc;
	String os;
	double price;
	//Set s=new HashSet();
	public boolean equals(CellPhone b)
	{
		if((this.company.equals(b.company)) && (this.type.equals(b.type)) && (this.os.equals(b.os)))
			return true;
		return false;
	}
	public CellPhone(String c,String m,String d,String o,double p)
	{
		company=c;
		type=m;
		desc=d;
		os=o;
		price=p;
	}
	public String toString()
	{
		return "CellPhone Details: "+company+" , "+type+" , "+desc+" , "+os+" , "+price;
	}

}

