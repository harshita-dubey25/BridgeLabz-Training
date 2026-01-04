package com.linkedlist.moviemanagement;


public class Movie {
	public String title;
	public String director;
	public int releaseYear;
	public double rating;
	Movie next;
	Movie prev;
	
	public Movie(String title, String director, int releaseYear, double rating) {
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}
	
}