import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ashwini");
		l.add("Dharewa");
		l.add("CSE");
		System.out.println(l);
		ListIterator it=l.listIterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			if(s.equals("CSE"))
				it.remove();
		}
		System.out.println(l);

	}

}
