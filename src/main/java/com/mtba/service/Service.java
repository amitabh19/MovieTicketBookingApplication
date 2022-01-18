package com.mtba.service;

import java.util.HashMap;
import java.util.List;

import com.mtba.entities.City;
import com.mtba.entities.Movie;
import com.mtba.entities.Theatre;
import java.time.LocalDateTime;

public interface Service {
	public List<Theatre> listOfTheatres_from_City(City city);
	public List<Theatre> listOfTheatres_Playing_A_Movie(List<Theatre> t, Movie movie);
	public List<Movie> listOfMovies_playing_in_Theatre(Theatre theatre);
	public List<Movie> listOfMovies_playing_in_City(City city);
	public List<Movie> moviesAboveRating(double rating);
	public HashMap<Movie, LocalDateTime> showTimes(Movie movie, Theatre theatre);

}
