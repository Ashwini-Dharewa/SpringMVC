package SixthActivity;
import java.util.*;
public class StringCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=new String[50];
		String s1="";
		int i=-1;
		System.out.println("Enter the String:");
		do
		{
			i++;
			s[i]=sc.nextLine();
			s1=s1+s[i];
		}while(!(s[i].equals("DONE")));
		try
		{
			if(s1.length()>20)
				throw new StringTooLongException();
			System.out.println(s1+" is a valid string.");
		}
		catch(StringTooLongException e)
		{
			e.getMessage();
		}

	}

}
