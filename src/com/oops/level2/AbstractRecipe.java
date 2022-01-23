package com.oops.level2;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		prepareTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void prepareTheDish();

	abstract void cleanup();

	// prepare
	// recipe
	// cleanup
}
