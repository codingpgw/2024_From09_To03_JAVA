package com.pcwk.ehr.project01;
import java.time.LocalDate;

public class MovieList {
	public String movieName;
	public LocalDate date;
	public String supervision;
	public int ageLimit;
	public double rating;
	
	public MovieList(String movieName,LocalDate date, String supervision, int ageLimit, double rating ) {
		this.movieName = movieName;
		this.date = date;
		this.supervision = supervision;
		this.ageLimit = ageLimit;
		this.rating = rating;
	}
}
