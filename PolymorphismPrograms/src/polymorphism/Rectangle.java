package polymorphism;

public class Rectangle extends Shape{
	protected double length;
	protected double width;
	public Rectangle()
	{
		
	}
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public Rectangle(double length,double width,String color,boolean filled)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea()
	{
		return (length*width);
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	public String toString()
	{
		return ("Area= "+getArea()+" and perimeter= "+getPerimeter()+" ,Color= "+color+",filled= "+filled);
	}

}