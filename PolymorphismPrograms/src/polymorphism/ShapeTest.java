package polymorphism;
public class ShapeTest {

	public static void main(String[] args) {
		Circle ob1=new Circle(10,"Red",true);
		Rectangle ob2=new Rectangle(10,5,"Blue",false);
		Square ob3=new Square(50,"Green",true);
		System.out.println("Circle:\n"+ob1.toString());
		System.out.println("Rectangle:\n"+ob2.toString());
		System.out.println("Square:\n"+ob3.toString());

	}

}
