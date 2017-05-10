package com.andrzej;

import com.andrzej.animals.Cangaroo;
import com.andrzej.animals.Dog;
import com.andrzej.animals.Elephant;

import java.util.ArrayList;

/**
 * Created by andrzej on 10.05.17.
 */
public class Zoo {
	//to avoid using and creating everything in main method create zoo method, when we initalize interfaces

	private ArrayList<Dog> allDogs = new ArrayList<>();
	private ArrayList<Elephant> allElephants = new ArrayList<>();
	private ArrayList<Cangaroo> allCangaroos = new ArrayList<>();

	public void init() {

		allDogs.add(new Dog());
		allElephants.add(new Elephant());
		allCangaroos.add(new Cangaroo());

	}

	public void runAllAnimals() {
		for (Dog dog: allDogs) {
			dog.run();
		}
		for (Elephant elephant: allElephants) {
			elephant.run();
		}
		for (Cangaroo cangaroo: allCangaroos) {
			cangaroo.run();
		}
	}

}
