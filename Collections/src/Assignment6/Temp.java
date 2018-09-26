package Assignment6;
import java.util.*;
public class Temp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product ob[]=new Product[5];
		Map<Integer,String> t=new TreeMap<Integer,String>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the id and name of product "+(i+1));
			int pi=sc.nextInt();
			String n=sc.next();
			ob[i]=new Product(pi,n);			
		}
		for(int i=0;i<5;i++)
			t.put(ob[i].prodId,ob[i].prodName);
		System.out.println("Sorted according to key value elements:");
		for(Map.Entry m:t.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		}
	

	}

}
