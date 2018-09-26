package FirstActivity;

public class CalculatorSimulator {
	public static void main(String[] args)
	{
	TaxCalculator ob1=new TaxCalculator();
	double a1,a2,a3,a4;
	a1=ob1.calculateTax("Ron",false,34000);
	a2=ob1.calculateTax("Tim",true,1000);
	a3=ob1.calculateTax("Jack",true,55000);
	System.out.println("Tax amount is "+a3);
	a4=ob1.calculateTax("",true,30000);
	}

}
