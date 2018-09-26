package Assignment3;
import java.util.*;
public class MMASavingAccount {
	int accId;
	String accHolderName;
	double accBlnc;
	boolean isSalary;
	public MMASavingAccount(int i,String n,double b,boolean s)
	{
		accId=i;
		accHolderName=n;
		accBlnc=b;
		isSalary=s;
	}
	public String toString()
	{
		return "Account Id= "+accId+" ,Holder Name= "+accHolderName+" ,Balance= "+accBlnc+" ,Salary Account= "+isSalary;
	}
	public static void main(String[] args)
	{
		EmployeeInformation e[]=new EmployeeInformation[4];
		MMASavingAccount m[]=new MMASavingAccount[4];
		e[0]=new EmployeeInformation(1,"Ab","BA",1000,500);
		e[1]=new EmployeeInformation(2,"Bc","BTech",7000,1500);
		e[2]=new EmployeeInformation(3,"Cd","BA",1700,900);
		e[3]=new EmployeeInformation(4,"De","BEd",2000,200);
		m[0]=new MMASavingAccount(10,"De",1900,true);
		m[1]=new MMASavingAccount(11,"Ab",2300,false);
		m[2]=new MMASavingAccount(12,"Bc",1500,true);
		m[3]=new MMASavingAccount(13,"Cd",2000,false);
		ArrayList a=new ArrayList();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if((e[i].empName).equals(m[j].accHolderName))
				{
					a.add(e[i]);
					a.add(m[j]);
				}
			}
		}
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
	}

}
