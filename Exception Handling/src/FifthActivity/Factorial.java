package FifthActivity;
import java.util.*;
public class Factorial {
	int n;
	public int getFactorial(int num)
	{
		int r=1;
		try
		{
			if(num<2)
				throw new InvalidInputException();
			for(int i=1;i<=num;i++)
				r=r*i;
			if(num>12)
				throw new FactorialException();
			System.out.println("Factorial= "+r);
		}
		catch(InvalidInputException e1)
		{
			e1.getMessage();
		}
		catch(FactorialException e2)
		{
			e2.getMessage();
		}
		return r;
			
	}
	public static void main(String[] args)
	{
		int num;long x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		Factorial ob=new Factorial();
		x=ob.getFactorial(num);
	}

}
