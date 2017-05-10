package com.andrzej;

import com.andrzej.Interfaces.Audible;
import com.andrzej.Interfaces.Moveable;
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

	private ArrayList<Moveable> moveables = new ArrayList<>(); //we initialize interface in arraylist. next we used it in method runAnimalsByInterfaceRef

	private ArrayList<Audible> audibles = new ArrayList<>();

	public void init() {


		Dog dog = new Dog();
		allDogs.add(new Dog());

		Elephant elephant = new Elephant();
		allElephants.add(new Elephant());

		Cangaroo cangaroo = new Cangaroo();
		allCangaroos.add(new Cangaroo());

		moveables.add(dog);
		moveables.add(elephant);
		moveables.add(cangaroo);

		audibles.add(dog);
		audibles.add(elephant);
		audibles.add(cangaroo);

	}

	public void runAllAnimals() {
		for (Dog dog : allDogs) {
			dog.run();
		}
		for (Elephant elephant : allElephants) {
			elephant.run();
		}
		for (Cangaroo cangaroo : allCangaroos) {
			cangaroo.run();
		}
	}

	public void hideAllAnimals() {
		for (Dog dog : allDogs) {
			dog.hide();
		}
		for (Elephant elephant : allElephants) {
			elephant.hide();
		}
		for (Cangaroo cangaroo : allCangaroos) {
			cangaroo.hide();
		}

	}

	public void runAnimalsByInterfaceRef() {
		for (Moveable moveable : moveables) {
			moveable.run();
		}
	}

	public void hideAnimalsByInterfaceRef() {
		for (Moveable moveable : moveables) {
			moveable.hide();
		}
	}
	public void makeNoiseAllAnimalsByInterfaceRef() {
		for (Audible audible : audibles) {
			audible.makeNoise();
		}
	}

	public void doSomething (Audible audible) {
		audible.makeNoise();
	}

}
