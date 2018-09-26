package polymorphism;

public class Square extends Rectangle{
	double side;
	public Square()
	{
		
	}
	public Square(double side)
	{
		this.side=side;
	}
	public Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
		this.side=side;
	}
	public void setWidth(double side)
	{
		width=side;
	}
	public void setLength(double side)
	{
		length=side;
	}
	public String toString()
	{
		return ("Area= "+getArea()+" and perimeter= "+getPerimeter()+" ,Color= "+color+",filled= "+filled);
	}

}
