package com.andrzej.animals;

import com.andrzej.Interfaces.Audible;
import com.andrzej.Interfaces.Moveable;

/**
 * Created by andrzej on 10.05.17.
 */
public class Dog implements Moveable, Audible {

		//override is generated automatically to provide arguments. without override class will not use method from interface moveable
	@Override
	public void run() {
		//System.out.println("Dog is running"); in order to imput automatically the name of the class (dog in this case) use the method getsimplename
		System.out.println(this.getClass().getSimpleName() + " is running");
	}

	@Override
	public void hide() {
		System.out.println("Dog is hidden");
	}

	@Override
	public void makeNoise() {
		System.out.println(this.getClass().getSimpleName() + " is making noise");
	}
}
