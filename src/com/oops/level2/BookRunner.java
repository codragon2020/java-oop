package com.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOP with Java", "Jason");

		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}

}
