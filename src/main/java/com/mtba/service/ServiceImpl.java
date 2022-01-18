package com.mtba.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mtba.entities.City;
import com.mtba.entities.Movie;
import com.mtba.entities.Theatre;

public class ServiceImpl implements Service {

	public List<Theatre> listOfTheatres_from_City(City city) {

		if (city == null || (city.getiD() == null)) {
			return null;
		}

		return city.getListOfTheatres();

	}

	public List<Theatre> listOfTheatres_Playing_A_Movie(List<Theatre> theatre, Movie movie) {
		List<Theatre> moviePlayingTheatres = new ArrayList<Theatre>();
		for (Theatre t : theatre) {
			if (t.getMovieList().contains(movie)) {
				moviePlayingTheatres.add(t);
			}
		}
		return moviePlayingTheatres;
	}

	public List<Movie> listOfMovies_playing_in_Theatre(Theatre theatre) {
		if (theatre == null) {
			return null;
		}

		return theatre.getMovieList();
	}

	public List<Movie> listOfMovies_playing_in_City(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> moviesAboveRating(double rating) {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<Movie, LocalDateTime> showTimes(Movie movie, Theatre theatre) {
		// TODO Auto-generated method stub
		return null;
	}

}
