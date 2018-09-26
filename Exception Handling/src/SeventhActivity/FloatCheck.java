
package SeventhActivity;
import java.util.*;
public class FloatCheck {
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements:");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		float a[]=new float[20];
		int i=0,c=0;
		String s;
		System.out.println("Enter the floating point numbers: ");
		
		for(i=0;i<n;i++)
		{
			int flag=0;
			s=sc.next();
			for(int k=0;k<s.length();k++)
			{
				char p=s.charAt(k);
			if(Character.isLetter(p))
			{
				i--;
				c++;
				try
				{
					
					throw new InvalidInputException();
				}
				catch(InvalidInputException e)
				{
					e.getMessage();
				}
				flag=1;
				break;

			}
			}
			if(flag==0)
			a[i]=Float.parseFloat(s);
			if(c==2)
			{
				System.out.println("No more chances left to enter the wrong input.");
				break;
			}
				
			
			
		}
		double sum=0;
		for(int j=0;j<=i;j++)
			sum=sum+a[j];
		
		System.out.println("Total sum= "+sum);	
		
		
	}

}
