package EigthActivity;
import java.util.*;
public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the customer number:");
		String cno=sc.next();
		System.out.println("Enter the customer name:");
		String cname=sc.next();
		System.out.println("Enter the category:");
		String c=sc.next();
		Customer ob=new Customer(cno,cname,c);

	}

}
