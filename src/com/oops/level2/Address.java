package com.oops.level2;

public class Address {

	// state
	private String street;
	private String city;
	private String zip;

	// creation
	public Address(String street, String city, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return street + ", " + city + ", " + zip;
	}

}
