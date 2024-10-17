package com.treesets;

import java.util.Objects;

//import java.util.Date;

public class Movies implements Comparable<Movies> {

	private String movieYr;
	private String movieName;
	private String role;
	
	
	public Movies(String movieYr, String movieName, String role) {
		this.movieYr = movieYr;
		this.movieName = movieName;
		this.role = role;
	}


	public String getMovieYr() {
		return movieYr;
	}


	public void setMovieYr(String movieYr) {
		this.movieYr = movieYr;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
    public int hashCode() {
	return Objects.hash(movieName , movieYr,role);

}
@Override
public boolean equals(Object obj) {
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	Movies movie = (Movies) obj;
	return (this.movieName.equals(movie.movieName)
			&& this.movieYr.equals(movie.movieYr)
			&& this.role.equals(movie.role)
			);
	
	
}

	@Override
	public String toString() {
		return "Movies [movieYr=" + movieYr + ", movieName=" + movieName + ", role=" + role + "]";
	}


	@Override
	public int compareTo(Movies o) {
		return this.movieYr.compareTo(o.movieYr);
	}
	
	
	
	
	
	
}
