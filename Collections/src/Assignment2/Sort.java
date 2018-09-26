package Assignment2;
import java.util.Comparator;

public class Sort implements Comparator<MovieDetails>{
	String s;
	public Sort(String c)
	{
		s=c;
	}

	public int compare(MovieDetails a,MovieDetails b)
	{
		if(s.equals("movName"))
			return (a.movName.compareTo(b.movName));
		else if(s.equals("leadActor"))
			return (a.leadActor.compareTo(b.leadActor));
		else if(s.equals("leadActress"))
			return (a.leadActress.compareTo(b.leadActress));
		else if(s.equals("genre"))
			return (a.genre.compareTo(b.genre));
		return 0;
	}

}
