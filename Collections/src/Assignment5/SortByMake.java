package Assignment5;
import java.util.Comparator;
public class SortByMake implements Comparator<Car>{
	
	public int compare(Car a,Car b)
		{
			return a.make.compareTo(b.make);
		}

	}



