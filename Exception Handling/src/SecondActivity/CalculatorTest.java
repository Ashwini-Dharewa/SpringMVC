package SecondActivity;

public class CalculatorTest {

	public static void main(String[] args) {
		MyCalculator ob=new MyCalculator();
		long a1,a2,a3,a4,a5;
		a1=ob.power(3,5);
		System.out.println(a1);
		a2=ob.power(2,4);
		System.out.println(a2);
		a3=ob.power(0,0);
		a4=ob.power(-1,-2);
		a5=ob.power(-1,3);

	}

}
