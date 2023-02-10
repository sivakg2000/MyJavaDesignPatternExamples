package com.sivakg.examples.dp.structural.decorator.impl;

import com.sivakg.examples.dp.structural.decorator.Bike;

public class DecoratorBike implements Bike {

	private Bike bike;
	@Override
	public void assembleBike() {
		 bike.assembleBike();
		
	}
	public DecoratorBike(Bike bike) {
		super();
		this.bike = bike;
	}
	 

}
