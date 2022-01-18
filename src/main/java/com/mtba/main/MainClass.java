package com.mtba.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mtba.entities.City;
import com.mtba.entities.Movie;
import com.mtba.entities.Theatre;
import com.mtba.service.ServiceImpl;

public class MainClass {
	
	public static void populateDatabase()
	{
	}

	public static void main(String[] args) {
		
		//populateDatabase();
		Movie m1 = new Movie(1, "The Godfather", "Crime", 5.0);
		Movie m2 = new Movie(2, "The Godfather 2", "Crime", 5.0);
		Movie m3 = new Movie(3, "The Godfather 3", "Crime", 4.0);
		Movie m4 = new Movie(4, "Intersteller", "Sci-fi", 5.0);
		Movie m5 = new Movie(5, "The Dark Knight", "Action", 5.0);
		Movie m6 = new Movie(6, "SpiderMan No way home", "Action", 4.5);
		Movie m7 = new Movie(7, "Harry Potter 7", "Fiction", 4.0);
		Movie m8 = new Movie(8, "Fight Club", "Drama", 5.0);
		Movie m9 = new Movie(9, "Get out", "Horror", 3.0);
		Movie m10 = new Movie(10, "Goodfellas", "Biography", 2.0);
		
		

		Theatre t1 = new Theatre();
		t1.setiD(1);
		t1.setNoOfScreens(8);
		t1.setTheatreName("Grand Palace Cinemas");
		List<Movie> listMoviesT1 = new ArrayList<Movie>();
		listMoviesT1.add(m1);
		listMoviesT1.add(m5);
		
		LocalDateTime ldt = LocalDateTime.of(2022, 01, 19, 9, 30);
		LocalDateTime ldt1 = LocalDateTime.of(2022, 01, 19, 11, 30);
		LocalDateTime ldt2 = LocalDateTime.of(2022, 01, 19, 14, 30);
		LocalDateTime ldt3 = LocalDateTime.of(2022, 01, 19, 17, 30);
		LocalDateTime ldt4 = LocalDateTime.of(2022, 01, 19, 20, 30);
		
		HashMap<Movie, List<LocalDateTime>> showTimes = new HashMap<Movie, List<LocalDateTime>>();
		List<LocalDateTime> lldt = new ArrayList<LocalDateTime>();
		lldt.add(ldt1);
		lldt.add(ldt3);
		lldt.add(ldt4);
		List<LocalDateTime> lldt1 = new ArrayList<LocalDateTime>();
		lldt1.add(ldt);
		lldt1.add(ldt2);
		lldt1.add(ldt4);
		showTimes.put(m1,lldt);
		showTimes.put(m5, lldt1);
		t1.setShowtimes(showTimes);
		t1.setMovieList(listMoviesT1);
		//System.out.println(t1.toString());
		
		Theatre t2 = new Theatre();
		t2.setiD(2);
		t2.setNoOfScreens(8);
		t2.setTheatreName("Big Palace Cinemas");
		List<Movie> listMoviesT2 = new ArrayList<Movie>();
		listMoviesT2.add(m2);
		listMoviesT2.add(m3);
		
		
		HashMap<Movie, List<LocalDateTime>> showTimesT2 = new HashMap<Movie, List<LocalDateTime>>();
		List<LocalDateTime> lldt2 = new ArrayList<LocalDateTime>();
		lldt2.add(ldt1);
		lldt2.add(ldt3);
		lldt2.add(ldt4);
		List<LocalDateTime> lldt3 = new ArrayList<LocalDateTime>();
		lldt3.add(ldt);
		lldt3.add(ldt2);
		lldt3.add(ldt4);
		showTimesT2.put(m2,lldt2);
		showTimesT2.put(m3, lldt3);
		t2.setShowtimes(showTimesT2);
		t2.setMovieList(listMoviesT2);
		//System.out.println(t2.toString());
		
		Theatre t3 = new Theatre();
		t3.setiD(3);
		t3.setNoOfScreens(8);
		t3.setTheatreName("Majestic Palace Cinemas");
		List<Movie> listMoviesT3 = new ArrayList<Movie>();
		listMoviesT3.add(m6);
		listMoviesT3.add(m3);
		
		
		HashMap<Movie, List<LocalDateTime>> showTimesT3 = new HashMap<Movie, List<LocalDateTime>>();
		List<LocalDateTime> lldt4 = new ArrayList<LocalDateTime>();
		lldt4.add(ldt1);
		lldt4.add(ldt3);
		lldt4.add(ldt4);
		List<LocalDateTime> lldt5 = new ArrayList<LocalDateTime>();
		lldt5.add(ldt);
		lldt5.add(ldt2);
		lldt5.add(ldt4);
		showTimesT3.put(m6,lldt4);
		showTimesT3.put(m3, lldt5);
		t3.setShowtimes(showTimesT3);
		t3.setMovieList(listMoviesT3);
		//System.out.println(t3.toString());
		
		Theatre t4 = new Theatre();
		t4.setiD(4);
		t4.setNoOfScreens(8);
		t4.setTheatreName("Huge Palace Cinemas");
		List<Movie> listMoviesT4 = new ArrayList<Movie>();
		listMoviesT4.add(m7);
		listMoviesT4.add(m9);
		
		
		HashMap<Movie, List<LocalDateTime>> showTimesT4 = new HashMap<Movie, List<LocalDateTime>>();
		List<LocalDateTime> lldt6 = new ArrayList<LocalDateTime>();
		lldt6.add(ldt1);
		lldt6.add(ldt3);
		lldt6.add(ldt4);
		List<LocalDateTime> lldt7 = new ArrayList<LocalDateTime>();
		lldt7.add(ldt);
		lldt7.add(ldt2);
		lldt7.add(ldt4);
		showTimesT4.put(m7,lldt6);
		showTimesT4.put(m9, lldt7);
		t4.setShowtimes(showTimesT4);
		t4.setMovieList(listMoviesT4);
		//System.out.println(t4.toString());
		

		Theatre t5 = new Theatre();
		t5.setiD(5);
		t5.setNoOfScreens(8);
		t5.setTheatreName("Huge Palace Cinemas");
		List<Movie> listMoviesT5 = new ArrayList<Movie>();
		listMoviesT5.add(m8);
		listMoviesT5.add(m10);
		
		
		HashMap<Movie, List<LocalDateTime>> showTimesT5 = new HashMap<Movie, List<LocalDateTime>>();
		List<LocalDateTime> lldt8 = new ArrayList<LocalDateTime>();
		lldt8.add(ldt1);
		lldt8.add(ldt3);
		lldt8.add(ldt4);
		List<LocalDateTime> lldt9 = new ArrayList<LocalDateTime>();
		lldt9.add(ldt);
		lldt9.add(ldt2);
		lldt9.add(ldt4);
		showTimesT5.put(m8,lldt8);
		showTimesT5.put(m10, lldt9);
		t5.setShowtimes(showTimesT5);
		t5.setMovieList(listMoviesT5);
		//System.out.println(t5.toString());
		
		List<Theatre> lot1 = new ArrayList<Theatre>();
		lot1.add(t1);
		lot1.add(t2);
		City city1 = new City(1, "Bhopal", 464002, lot1);
		
		List<Theatre> lot2 = new ArrayList<Theatre>();
		lot2.add(t3);
		City city2 = new City(2, "Indore", 464003, lot2);
		
		List<Theatre> lot3 = new ArrayList<Theatre>();
		lot3.add(t4);
		lot3.add(t5);
		City city3 = new City(3, "Delhi", 110001, lot2);
		
		//System.out.println(city1.toString()+" \n" + city2.toString() + "\n" + city3.toString());

		ServiceImpl simpl = new ServiceImpl();
		//list of theatres from city
		for(Theatre t: simpl.listOfTheatres_from_City(city1)) {
			System.out.println(t.getTheatreName());
		}
		
		//list of movies from theatres
		for(Movie m: simpl.listOfMovies_playing_in_Theatre(t2)) {
			System.out.println(m.getMovieName());
		}
		
		//list of theatres playing a particular movie
		List<Theatre> lott = new ArrayList<Theatre>();
		lott.add(t1);
		lott.add(t2);
		lott.add(t3);
		lott.add(t4);
		lott.add(t5);
		for(Theatre t: simpl.listOfTheatres_Playing_A_Movie(lott, m3)) {
			System.out.println(m3.getMovieName() + " playing in "+ t.getTheatreName() + " at showtimes " + t.getShowtimes().getOrDefault(m3, null));
		}
	}

}
