package com.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the ingredients");
		System.out.println("Get the utensils");

	}

	@Override
	void prepareTheDish() {
		System.out.println("Prepare the dish");

	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");

	}

}
