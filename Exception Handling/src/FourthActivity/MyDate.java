package FourthActivity;
import java.util.*;
public class MyDate {
	int d,m,y;
	public MyDate(int dd,int mm,int yy)
	{
		d=dd;
		m=mm;
		y=yy;
	}
	public void check()
	{
		try
		{
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12)
			{
			if(d<1 || d>31)
				throw new InvalidDayException();
			}
			else
			{
				if(d<1 || d>30)
					throw new InvalidDayException();
			}
			if(m<1 || m>12)
				throw new InvalidMonthException();
			System.out.println("Valid date");
		}
		catch(InvalidDayException e1)
		{
			e1.getMessage();
		}
		catch(InvalidMonthException e2)
		{
			e2.getMessage();
		}
	}

	public static void main(String[] args) {
		int dd[]=new int[20];
		int mm[]=new int[20];
		int yy[]=new int[20];
		int j=0;
		for(int i=0;i<7;i++)
		{
			dd[i]=Integer.parseInt(args[j++]);
			mm[i]=Integer.parseInt(args[j++]);
			yy[i]=Integer.parseInt(args[j++]);
			MyDate ob=new MyDate(dd[i],mm[i],yy[i]);
			ob.check();
		}
		
		

	}

}
