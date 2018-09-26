package Assignment5;




public class School {
	String name;
	String city;
	String dist;
	int rank;
	//Set s=new HashSet();
	public boolean equals(School b)
	{
		if((this.name.equals(b.name)) && (this.city.equals(b.city)) && (this.dist.equals(b.dist)))
			return true;
		return false;
	}
	public School(String c,String m,String d,int r)
	{
		name=c;
		city=m;
		dist=d;
		rank=r;
	}
	public String toString()
	{
		return "School Details: "+name+" , "+city+" , "+dist+" , "+rank;
	}
	

}


