package polymorphism;

public class Circle extends Shape {
	double radius;
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea()
	{
		return (3.14*radius*radius);
	}
	public double getPerimeter()
	{
		return (2*3.14*radius);
	}
	public String toString()
	{
		return ("Area= "+getArea()+" and perimeter= "+getPerimeter()+" ,Color= "+color+",filled= "+filled);
	}

}
