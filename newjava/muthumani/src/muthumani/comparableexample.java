package muthumani;


import java.io.*;
import java.util.*;


		// A class 'Movie' that 
class Movie implements Comparable<Movie>
		{
		    private double rating;
		    private String name;
		    private int year;

		    // Used to sort movies by year
		    public int compareTo(Movie m)
		    {
		        return this.year - m.year;
		    }

		    // Constructor
		    public Movie(String nm, double rt, int yr)
		    {
		        this.name = nm;
		        this.rating = rt;
		        this.year = yr;
		    }

		    // Getter methods for accessing private data
		    public double getRating() { return rating; }
		    public String getName()   {  return name; }
		    public int getYear()      {  return year;  }
		}

		public class comparableexample {	
		public static void main(String[] args) {
			// A Java program to demonstrate use of Comparable

	        ArrayList<Movie> list = new ArrayList<Movie>();
	        list.add(new Movie("Force Awakens", 9.3, 2015));
	        list.add(new Movie("Star Wars", 8.2, 1977));
	        list.add(new Movie("Empire Strikes Back", 5.9, 1980));
	        list.add(new Movie("Return of the Jedi", 10.7, 1983));

	        Collections.sort(list);

	        System.out.println("Movies after sorting : ");
	        for (Movie movie: list)
	        {
	            System.out.println(movie.getName() + " " +
	                               movie.getRating() + " " +
	                               movie.getYear());
	        }
	    }    
		

	}



