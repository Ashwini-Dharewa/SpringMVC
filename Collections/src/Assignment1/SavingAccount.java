package Assignment1;

public class SavingAccount {
	double acc_balance;
	int acc_ID;
	String accountHolderName;
	boolean isSalaryAccount;
	public SavingAccount(double b,int ai,String n,boolean s)
	{
		acc_balance=b;
		acc_ID=ai;
		accountHolderName=n;
		isSalaryAccount=s;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public String toString()
	{
		return "Balance: "+acc_balance+" ,Account Id: "+acc_ID+" ,Name: "+accountHolderName+" ,Savings Account: "+isSalaryAccount;
	}
	public void deposit(double sum)
	{
		acc_balance+=sum;
		System.out.println("New Balance= "+acc_balance);
	}
	public void withdraw(double sum)
	{
		if(sum>acc_balance)
			System.out.println("Amount greater than balance!!");
		else
		{
		acc_balance-=sum;
		System.out.println("New Balance= "+acc_balance);
		}
	}

}
