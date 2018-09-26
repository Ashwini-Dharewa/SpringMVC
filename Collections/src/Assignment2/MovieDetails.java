package Assignment2;

public class MovieDetails {
	String movName;
	String leadActor;
	String leadActress;
	String genre;
	public MovieDetails(String m,String actor,String actress,String g)
	{
		movName=m;
		leadActor=actor;
		leadActress=actress;
		genre=g;
	}
	public String toString()
	{
		return " Movie name= "+movName+" ,Actor= "+leadActor+" ,Actress= "+leadActress+" ,Genre= "+genre;
	}
	public String getMovName() {
		return movName;
	}
	public void setMovName(String movName) {
		this.movName = movName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
