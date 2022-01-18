package com.mtba.entities;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Theatre {
	
	private int iD;
	private String theatreName;
	private List<Movie> movieList;
	private int noOfScreens;
	private HashMap<Movie, List<LocalDateTime>> showtimes;

	public Theatre() {
		// TODO Auto-generated constructor stub
	}

	public Theatre(int iD, String theatreName, List<Movie> movieList, int noOfScreens,
			HashMap<Movie, List<LocalDateTime>> showtimes) {
		super();
		this.iD = iD;
		this.theatreName = theatreName;
		this.movieList = movieList;
		this.noOfScreens = noOfScreens;
		this.showtimes = showtimes;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public HashMap<Movie, List<LocalDateTime>> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(HashMap<Movie, List<LocalDateTime>> showtimes) {
		this.showtimes = showtimes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iD;
		result = prime * result + ((movieList == null) ? 0 : movieList.hashCode());
		result = prime * result + noOfScreens;
		result = prime * result + ((showtimes == null) ? 0 : showtimes.hashCode());
		result = prime * result + ((theatreName == null) ? 0 : theatreName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		if (iD != other.iD)
			return false;
		if (movieList == null) {
			if (other.movieList != null)
				return false;
		} else if (!movieList.equals(other.movieList))
			return false;
		if (noOfScreens != other.noOfScreens)
			return false;
		if (showtimes == null) {
			if (other.showtimes != null)
				return false;
		} else if (!showtimes.equals(other.showtimes))
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Theatre [iD=" + iD + ", theatreName=" + theatreName + ", movieList=" + movieList + ", noOfScreens="
				+ noOfScreens + ", showtimes=" + showtimes + "]";
	}

	
	
	

}
