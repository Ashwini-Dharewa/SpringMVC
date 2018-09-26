package Assignment1;
import java.util.*;
public class SortById implements Comparator<SavingAccount>{

	public int compare(SavingAccount a,SavingAccount b)
	{
		return a.acc_ID-b.acc_ID;
	}

}
