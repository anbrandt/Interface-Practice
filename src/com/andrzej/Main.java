package com.andrzej;

import com.andrzej.Interfaces.Audible;
import com.andrzej.animals.Cangaroo;
import com.andrzej.animals.Dog;
import com.andrzej.animals.Elephant;

public class Main {

	public static void main(String[] args) {

		Dog reksio = new Dog();
		Elephant slon = new Elephant();
		Cangaroo roger = new Cangaroo();

		reksio.hide();
		slon.run();
		roger.hide();

		System.out.println("-------------------");
		System.out.println();

		Zoo zooKrakow = new Zoo();
		zooKrakow.init();

		zooKrakow.runAllAnimals(); //method created in zoo class, that initialize methods from interface on all elements of an array
		zooKrakow.hideAllAnimals();

		System.out.println("------RUN AND HIDE ANIMALS INTERFACE METHODS FROM MOVEABLE INTERFACE-------");
		zooKrakow.runAnimalsByInterfaceRef(); //this method is much shorter than the previous ones
		System.out.println();
		zooKrakow.hideAnimalsByInterfaceRef();

		System.out.println();
		System.out.println("--------MAKE NOISE FROM AUDIBLE INTERFACE---------");
		zooKrakow.makeNoiseAllAnimalsByInterfaceRef();



	}
}
