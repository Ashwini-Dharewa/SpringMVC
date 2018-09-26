package Assignment7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class MyShopping {
	private static Hashtable<Customer,Order> h=new Hashtable<Customer,Order>();
	public MyShopping(Order o,Customer c)
	{
		h.put(c,o);
	}
    /*public void storeRecord(String filename)
    {
    	try 
    	{
    		FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos); 
                oos.writeObject(h);
           } catch (IOException e) {
               e.printStackTrace();
           }
    }
	
	public void getRecord(String filename)
	{
		try{
			FileInputStream fis = new FileInputStream(filename);
		    ObjectInputStream ois = new ObjectInputStream(fis);	              System.out.println( ois.readObject().toString());

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}
*/
	void display()
	{
		System.out.println("Contents: "+h);
	}
}
