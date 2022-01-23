package com.oops.level2;

public class Customer {

	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return String.format("name - [%s], Home Address - [%s], Work Address - [%s]", name, homeAddress, workAddress);
	}

	// operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}



}
