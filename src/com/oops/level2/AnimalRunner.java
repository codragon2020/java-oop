package com.oops.level2;

abstract class Animal {
	abstract void speak();
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Meow Meow");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };
		for (Animal animal : animals) {
			animal.speak();
		}
	}

}
