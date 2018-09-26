package ThirdActivity;
import java.util.*;
public class Student {
	int rollno;
	String name;
	int age;
	String course;
	public Student(int r,String n,int a,String c)
	{
		rollno=r;
		name=n;
		age=a;
		course=c;
	}
	public void check()
	{
		try
		{
			if(age<15 || age>21)
				throw new InvalidAgeException();
			for(int i=0;i<name.length();i++)
			{
				char c=name.charAt(i);
				int p=(int)c;
				if((p<65 || p>90) && (p<97 || p>122))
					throw new InvalidNameException();
			}
			System.out.println("Roll no ="+rollno+" ,name= "+name+" ,age= "+age+" ,course= "+course);
		}
		catch(InvalidAgeException e1)
		{
			e1.getMessage();
		}
		catch(InvalidNameException e2)
		{
			e2.getMessage();
		}
		
	}
	public static void main(String[] args)
	{
		int r,a;
		String n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number:");
		r=sc.nextInt();
		System.out.println("Enter name:");
		n=sc.next();
		System.out.println("Enter age:");
		a=sc.nextInt();
		System.out.println("Enter course:");
		c=sc.next();
		Student ob= new Student(r,n,a,c);
		ob.check();
		
		
	}
   
}
