/**
 * 
 */
package com.mtba.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mtba.entities.City;
import com.mtba.entities.Movie;
import com.mtba.entities.Theatre;
import com.mtba.service.ServiceImpl;

/**
 * @author amitabh
 *
 */
public class ServiceImplTest {

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#listOfTheatres_from_City(com.mtba.entities.City)}.
	 */
	
	@Test
	public void testListOfTheatres_from_City() {
		ServiceImpl impl = new ServiceImpl();
		//edge case
		assertEquals(null, impl.listOfTheatres_from_City(null));
		//unregistered city(city without any id)
		City c = new City();
		assertEquals(null, impl.listOfTheatres_from_City(c));
		//when city has correct data
		c.setiD(1);
		Theatre t = new Theatre();
		Theatre t1 = new Theatre();
		Theatre t2 = new Theatre();
		List<Theatre> lt = new ArrayList<Theatre>();
		lt.add(t);
		lt.add(t1);
		c.setListOfTheatres(lt);
		assertEquals(lt, impl.listOfTheatres_from_City(c));
		//when the expected list is differnt from actual list
		List<Theatre> lt1 = new ArrayList<Theatre>();
		lt1.add(t2);
		assertNotEquals(lt1, impl.listOfTheatres_from_City(c));
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#listOfTheatres_Playing_A_Movie(java.util.List, com.mtba.entities.Movie)}.
	 */
	@Test
	public void testListOfTheatres_Playing_A_Movie() {
		ServiceImpl impl = new ServiceImpl();
		//edge case
		assertEquals(null, impl.listOfTheatres_Playing_A_Movie(null, null));
		Theatre t = new Theatre();
		Theatre t1 = new Theatre();
		Theatre t2 = new Theatre();
		List<Theatre> lt = new ArrayList<Theatre>();
		Movie m = new Movie();
		assertEquals(null, impl.listOfTheatres_Playing_A_Movie(lt, m));
		lt.add(t);
		lt.add(t1);
		assertEquals(null, impl.listOfTheatres_Playing_A_Movie(lt, m));
		m.setiD(1);
		m.setMovieName("mov 1");
		t.setiD(1);
		t.setTheatreName("Theatre 1 name");
		t1.setiD(2);
		t1.setTheatreName("Theatre 2 name");
		t2.setiD(3);
		t2.setTheatreName("Theatre 3 name");
		List<Movie> actualMoviesPlaying = new ArrayList<Movie>();
		actualMoviesPlaying.add(m);
		t.setMovieList(actualMoviesPlaying);
		t2.setMovieList(actualMoviesPlaying);
		List<Theatre> expectedTheatrelist = new ArrayList<Theatre>();
		expectedTheatrelist.add(t);
		expectedTheatrelist.add(t2);
		List<Theatre> allTheatres = new ArrayList<Theatre>();
		allTheatres.add(t);
		allTheatres.add(t1);
		allTheatres.add(t2);
		assertEquals(expectedTheatrelist, impl.listOfTheatres_Playing_A_Movie(allTheatres, m));
		
		
		
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#listOfMovies_playing_in_Theatre(com.mtba.entities.Theatre)}.
	 */
	@Test
	public void testListOfMovies_playing_in_Theatre() {
		ServiceImpl impl = new ServiceImpl();
		//edge case
		assertEquals(null, impl.listOfMovies_playing_in_Theatre(null));
		//unregistered theatre(theatre without any id)
		Theatre t = new Theatre();
		assertEquals(null, impl.listOfMovies_playing_in_Theatre(t));
		//when theatre has correct data
		t.setiD(1);
		t.setNoOfScreens(8);
		t.setTheatreName("Theatre 1");
		Movie m = new Movie(1, "ADA", "crime", 4);
		Movie m1 = new Movie(2, "FDA", "crime", 3);
		Movie m2 = new Movie(3, "CDA", "crime", 5);
		List<Movie> actualList =  new ArrayList<Movie>();
		actualList.add(m);
		actualList.add(m1);
		actualList.add(m2);
		List<Movie> unexpectedList =  new ArrayList<Movie>();
		unexpectedList.add(m2);
		t.setMovieList(actualList);
		assertEquals(actualList, impl.listOfMovies_playing_in_Theatre(t));
		//wrong list of movies
		assertNotEquals(unexpectedList, impl.listOfMovies_playing_in_Theatre(t));
		
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#listOfMovies_playing_in_City(com.mtba.entities.City)}.
	 */
	@Test
	public void testListOfMovies_playing_in_City() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#moviesAboveRating(double)}.
	 */
	@Test
	public void testMoviesAboveRating() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#showTimes(com.mtba.entities.Movie, com.mtba.entities.Theatre)}.
	 */
	@Test
	public void testShowTimes() {
		fail("Not yet implemented");
	}

}
