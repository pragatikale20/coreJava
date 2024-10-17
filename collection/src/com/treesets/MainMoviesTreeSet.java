package com.treesets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.collections.comparator.MoviesComparator;

public class MainMoviesTreeSet {

	public static void main(String[] args) {
		//MoviesComparator nameComp = new MoviesComparator();
		//Set<Movies> moviesSets = new TreeSet<>(nameComp);
		
		Comparator<Movies> nameComparator = (movie1, movie2) -> movie1.getMovieName().compareTo(movie2.getMovieName());
		
		
//		Set<Movies> moviesSets = new TreeSet<>();
//		moviesSets.add(new Movies("2020","Avengers","AAA"));
//		moviesSets.add(new Movies("2010","Zanzeer","Vijay Khanna"));
//		moviesSets.add(new Movies("2021","Avengers","AAA"));
//		
		//nameComparator.forEach(System.out::println);
		
	
	}
}
