package com.mtba.entities;

import java.util.List;

public class City {

	private Integer iD;
	private String cityName;
	private int zipCode;
	private List<Theatre> listOfTheatres;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}


	public City(int iD, String cityName, int zipCode, List<Theatre> listOfTheatres) {
		this.iD = iD;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.listOfTheatres = listOfTheatres;
	}


	public Integer getiD() {
		return iD;
	}


	public void setiD(int iD) {
		this.iD = iD;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	public List<Theatre> getListOfTheatres() {
		return listOfTheatres;
	}


	public void setListOfTheatres(List<Theatre> listOfTheatres) {
		this.listOfTheatres = listOfTheatres;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + iD;
		result = prime * result + ((listOfTheatres == null) ? 0 : listOfTheatres.hashCode());
		result = prime * result + zipCode;
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
		City other = (City) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (iD != other.iD)
			return false;
		if (listOfTheatres == null) {
			if (other.listOfTheatres != null)
				return false;
		} else if (!listOfTheatres.equals(other.listOfTheatres))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "City [iD=" + iD + ", cityName=" + cityName + ", zipCode=" + zipCode + ", listOfTheatres="
				+ listOfTheatres + "]";
	}

	
}
