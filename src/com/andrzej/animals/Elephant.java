package com.andrzej.animals;

import com.andrzej.Interfaces.Audible;
import com.andrzej.Interfaces.Moveable;

/**
 * Created by andrzej on 10.05.17.
 */
public class Elephant implements Moveable, Audible{
	@Override
	public void run() {
		System.out.println("Elephant is running");
	}

	@Override
	public void hide() {
		System.out.println("Elephant is hidden");
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getClass().getSimpleName() + " is making noise");
	}
}
