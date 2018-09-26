package SecondActivity;

public class MyCalculator {
	public long power(int n,int p)
	{
		try
		{
			if(n==0 && p==0)
				throw new BothZeroException();
			if(n==0 || p==0)
				throw new SingleZeroException();
		    else if(n<0 || p<0)
				throw new NegativeException();
			
		}
		catch(BothZeroException e1)
		{
			e1.getMessage();
		}
		catch(SingleZeroException e2)
		{
			e2.getMessage();
		}
		catch(NegativeException e3)
		{
			e3.getMessage();
		}
		long x=1;
		for(int i=1;i<=p;i++)
			x=x*n;
		return x;
	}
	
}


