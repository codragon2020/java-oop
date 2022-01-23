package com.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Richmond", "23238");
		Customer customer = new Customer("Jason", homeAddress);

		Address workAddress = new Address("line 1 for work", "Richmond", "23238");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
