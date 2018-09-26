package JavaJUnitTesting;
import static org.junit.Assert.*;
import org.junit.Test;

public class Testing17
{
	
	@Test
public void check()
{
		int cy=2018;
		String sp="Yes";
		String hd="BTech";
		int yoh=2000;
		int c=1;
System.out.println("Check="+c);
if((sp.equals("Yes") && ((hd.compareTo("BA"))>0) && ((cy-yoh)>=5)))
c=0;

assertEquals(c,0);
}
	public void test() {
		fail("Not yet implemented");
	}
}

