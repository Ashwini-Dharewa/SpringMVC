package Assignment5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Assignment1.SortById;

public class Test {

	public static void main(String[] args) {
		Laptop l[]=new Laptop[3];
		l[0]=new Laptop("Hp","abc","linux","tyui");
		l[2]=new Laptop("Dell","fgh","unix","iop");
		l[1]=new Laptop("Hp","abc","linux","tyui");
		
		Car c[]=new Car[3];
		c[0]=new Car("BMW","abc",1905,15500);
		c[2]=new Car("Nano","fgh",2008,5300);
		c[1]=new Car("BMW","abc",1905,15500);
		
		Television t[]=new Television[3];
		t[1]=new Television("Onida","Lcd",true,12300);
		t[2]=new Television("Onida","Lcd",true,12300);
		t[0]=new Television("Samsung","Led",false,13402);
		
		CellPhone ce[]=new CellPhone[3];
		ce[0]=new CellPhone("Mi","Note3","good","android",9300);
		ce[1]=new CellPhone("Mi","Note3","good","android",9300);
		ce[2]=new CellPhone("Moto","g5s","nice","windows",12300);
				
		School s[]=new School[3];
		s[0]=new School("Kv","Delhi","chowk",3);
		s[2]=new School("Dps","Kolkata","megacity",2);
		s[1]=new School("Kv","Delhi","chowk",3);
		
		ArrayList c2=new ArrayList();
		for(int i=0;i<3;i++)
			c2.add(c[i]);
		ArrayList s2=new ArrayList();
		for(int i=0;i<3;i++)
			s2.add(s[i]);
		ArrayList ce2=new ArrayList();
		for(int i=0;i<3;i++)
			ce2.add(ce[i]);
		ArrayList t2=new ArrayList();
		for(int i=0;i<3;i++)
			t2.add(t[i]);
		ArrayList l2=new ArrayList();
		for(int i=0;i<3;i++)
			l2.add(l[i]);
		
		
		System.out.println("\tArrayList elements:");
		System.out.println(c2);
		System.out.println(l2);
		System.out.println(t2);
		System.out.println(ce2);
		System.out.println(s2);
		
		Set c1=new LinkedHashSet();
		for(int i=0;i<3;i++)
			c1.add(c[i]);
		Set s1=new LinkedHashSet();
		for(int i=0;i<3;i++)
			s1.add(s[i]);
		Set ce1=new LinkedHashSet();
		for(int i=0;i<3;i++)
			ce1.add(ce[i]);
		Set t1=new LinkedHashSet();
		for(int i=0;i<3;i++)
			t1.add(t[i]);
		Set l1=new LinkedHashSet();
		for(int i=0;i<3;i++)
			l1.add(l[i]);
		
		
		System.out.println("\tLinkedHash Set elements:");
		System.out.println(c1);
		System.out.println(l1);
		System.out.println(t1);
		System.out.println(ce1);
		System.out.println(s1);
		
		for(int i=1;i<2;i++)
		{
			boolean b=c[i].equals(c[i-1]);
			if(b)
			{
				c1.remove(c[i]);
			}
		}
		for(int i=1;i<2;i++)
		{
			boolean b=l[i].equals(l[i-1]);
			if(b)
			{
				l1.remove(l[i]);
			}
		}
		for(int i=1;i<2;i++)
		{
			boolean b=ce[i].equals(ce[i-1]);
			if(b)
			{
				ce1.remove(ce[i]);
			}
		}
		for(int i=1;i<3;i++)
		{
			if(t[i].hashCode()==t[i-1].hashCode())
			{
				boolean b=t[i].equals(t[i-1]);
				if(b)
				{
					t1.remove(t[i]);
				}
			}
		}
		for(int i=1;i<2;i++)
		{
			boolean b=s[i].equals(s[i-1]);
			if(b)
			{
				s1.remove(s[i]);
			}
		}
		System.out.println("\tAfter removing duplicates: ");
		System.out.println(c1);
		System.out.println(l1);
		System.out.println(t1);
		System.out.println(ce1);
		System.out.println(s1);
		
		TreeSet<Car> tree=new TreeSet<Car>(new SortByMake());
		for(int i=2;i>=0;i--)
			tree.add(c[i]);
		System.out.println("\tCar elements after sorting: ");
		System.out.println(tree);

	}

}
