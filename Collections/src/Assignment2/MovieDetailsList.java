package Assignment2;
import java.util.*;

import Assignment1.SortById;
public class MovieDetailsList {
	static List<MovieDetails> a=new ArrayList<MovieDetails>();
	public static void add_movie(MovieDetails m)
	{
		a.add(m);
	}
	public static void remove_movie(MovieDetails m)
	{
		a.remove(m);
	}
	public static void remove_AllMovies()
	{
		a.removeAll(a);
	}
	public static String find_movie_By_mov_Name(String s)
	{
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i).movName).equals(s))
			{
				System.out.println("Movie found.Details are:");
				System.out.println(a.get(i));
				return "Found";
			}
		}
		return "Not Found";
	}
	public static String find_movie_By_mov_Genre(String s)
	{
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i).genre).equals(s))
			{
				System.out.println("Genre found.Details are:");
				System.out.println(a.get(i));
				return "Found";
			}
		}
		return "Not Found";
	}
	public static void movie_detailsList(String c)
	{
		Collections.sort(a,new Sort(c));
			
	}

	public static void main(String[] args) {
		MovieDetails ob[]=new MovieDetails[5];
		ob[0]=new MovieDetails("Titanic","LDC","KW","abc");
		ob[1]=new MovieDetails("Inception","LDC","AJ","cde");
		ob[2]=new MovieDetails("Croods","RT","PA","fgh");
		ob[3]=new MovieDetails("Epic","SRK","PC","ijk");
		ob[4]=new MovieDetails("MI","RKR","DP","lmn");
		System.out.println("After adding: ");
		for(int i=0;i<5;i++)
			add_movie(ob[i]);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		System.out.println("After deleting one element:");
		remove_movie(ob[4]);
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
		System.out.println("After deleting all elements:");
		remove_AllMovies();
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		System.out.println("After adding 3elements: ");
		for(int i=0;i<3;i++)
			add_movie(ob[i]);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		String s=find_movie_By_mov_Name("Croods");
		if(s.equals("Not Found"))
			System.out.println("Movie not found");
		String s1=find_movie_By_mov_Genre("abc");
		if(s1.equals("Not Found"))
			System.out.println("Genre not found");
		movie_detailsList("movName");

		System.out.println("After sorting: ");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		

	}

}
