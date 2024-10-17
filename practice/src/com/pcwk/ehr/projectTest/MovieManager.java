package com.pcwk.ehr.projectTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
	private List<MovieList> movies;

	public MovieManager() {
		movies = new ArrayList<>();
		FileHandler.loadMovies(movies);
	}

	public void displayMovies() {
		// Logic to display all movies
	}

	public void addMovie(Scanner sc) {
		// Logic to add a movie
	}

	public void removeMovie(Scanner sc) {
		// Logic to remove a movie
	}

}
