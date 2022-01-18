/**
 * 
 */
package com.mtba.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mtba.entities.City;
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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mtba.service.ServiceImpl#listOfMovies_playing_in_Theatre(com.mtba.entities.Theatre)}.
	 */
	@Test
	public void testListOfMovies_playing_in_Theatre() {
		fail("Not yet implemented");
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
