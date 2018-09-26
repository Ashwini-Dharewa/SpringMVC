package LambdaExpressions;

public class PerformOperation {

	public static void main(String[] args) {
		CheckOdd ob1=(int n) -> {
				if(n%2==0)
					return false;
				else
					return true;
		};
		System.out.println("Check for Odd :");
		System.out.println("13="+ob1.isOdd(13));
		System.out.println("30="+ob1.isOdd(30));
		CheckPrime ob2=(int n) -> {
			int f=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					f=1;
					break;
				}					
			}			
			if(f==0)
				return true;
			else
				return false;
	};
	System.out.println("Check for Prime:");
	System.out.println("13="+ob2.isPrime(13));
	System.out.println("30="+ob2.isPrime(30));
	
	CheckPalindrome ob3=(int n) -> {
		int t,s=0,m=n;
		while(n>0)
		{
			t=n%10;
			s=(s*10)+t;
			n=n/10;
		}
		if(s==m)
			return true;
		else
			return false;
};
System.out.println("Check for Palindrome:");
System.out.println("121="+ob3.isPalindrome(121));
System.out.println("30="+ob3.isPalindrome(30));

	}

}
