package Assignment1;
import java.util.*;
public class BankAccountList {

	public static void main(String[] args) {
		SavingAccount ob[]=new SavingAccount[5];
		ob[0]=new SavingAccount(123444,5678,"Ashwini",true);
		ob[1]=new SavingAccount(78901,8902,"Tanu",true);
		ob[2]=new SavingAccount(12644,9078,"Riya",false);
		ob[3]=new SavingAccount(15644,2345,"Swagata",true);
		ob[4]=new SavingAccount(78901,8902,"Tanu",true);
		TreeSet<SavingAccount> a=new TreeSet<SavingAccount>(new SortById());
		a.add(ob[0]);
		a.add(ob[1]);
		a.add(ob[2]);
		a.add(ob[3]);
		a.add(ob[4]);
		System.out.println("Account Details:");
		for(SavingAccount s:a)
		{
			System.out.println("Balance: "+s.acc_balance+" ,Account Id: "+s.acc_ID+" ,Name: "+s.accountHolderName+" ,Savings Account: "+s.isSalaryAccount);
		}
		

	}

}
