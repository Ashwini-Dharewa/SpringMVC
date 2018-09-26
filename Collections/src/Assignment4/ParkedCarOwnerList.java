package Assignment4;
import java.util.*;
public class ParkedCarOwnerList {
	static ArrayList<ParkedCarOwnerDetails> a=new ArrayList<ParkedCarOwnerDetails>();
	static int addNewCar(ParkedCarOwnerDetails ob)
	{
		a.add(ob);
		return ob.carNo;
	}
	public static void removeCar(ParkedCarOwnerDetails ob)
	{
		a.remove(ob);
	}
	public static String getParkedCarLocation(int c)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).carNo==c)
				return a.get(i).address;
		}
		return "Not Found";
	}

	public static void main(String[] args) {
		ParkedCarOwnerDetails p[]=new ParkedCarOwnerDetails[3];
		p[0]=new ParkedCarOwnerDetails("Ashwini","SUV",1234,678905634,"Teghoria");
		p[1]=new ParkedCarOwnerDetails("Tanusree","Nano",3455,56340987,"Belghoria");
		p[2]=new ParkedCarOwnerDetails("Swagata","BMW",7894,90876789,"Garia");
		for(int i=0;i<3;i++)
			addNewCar(p[i]);
		System.out.println("After adding three elements:");
		for(int i=0;i<3;i++)
			System.out.println(a.get(i));
		removeCar(p[2]);
		System.out.println("After deleting last element:");
		for(int i=0;i<2;i++)
			System.out.println(a.get(i));
		String s=getParkedCarLocation(1234);
		System.out.println("Address of owner of car no. 1234:");
		System.out.println(s);
		
	  

	}

}
