package com.collections.comparator;
import java.util.Comparator;

import com.treesets.Movies;
public class MoviesComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		
		return o1.getMovieName().compareTo(o2.getMovieName());
	}
	
	public static Comparator<Movies> byMovieName = (movie1, movie2) -> 
	movie1.getMovieName().compareTo(movie2.getMovieName());
	
	public static Comparator<Movies> byMovieYr = (movie1, movie2) -> 
	movie1.getMovieYr().compareTo(movie2.getMovieYr());
	
	public static Comparator<Movies> byRole = (movie1, movie2) -> 
	movie1.getRole().compareTo(movie2.getRole());

}
