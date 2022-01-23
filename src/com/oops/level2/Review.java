package com.oops.level2;

public class Review {

	// state
	private int id;
	private String description;
	private int rating;

	// creation
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return id + " " + description + " " + rating;
	}
}
