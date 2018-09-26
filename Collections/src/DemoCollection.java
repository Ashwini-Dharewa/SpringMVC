import java.util.*;
public class DemoCollection {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			if(i%2==0)
				System.out.println(i);
			else
				it.remove();
		}
		System.out.println(a);
		

	}

}
