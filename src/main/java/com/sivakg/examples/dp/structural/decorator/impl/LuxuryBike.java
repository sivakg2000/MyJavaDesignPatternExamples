package com.sivakg.examples.dp.structural.decorator.impl;

import com.sivakg.examples.dp.structural.decorator.Bike;

public class LuxuryBike extends DecoratorBike{

	public LuxuryBike(Bike bike) {
		super(bike);
		// TODO Auto-generated constructor stub
	}
	
	 
	
	@Override
	public void assembleBike() {

		super.assembleBike();

		System.out.println("Adding featuers of Luxury Bike");
	}
	
	 

}
