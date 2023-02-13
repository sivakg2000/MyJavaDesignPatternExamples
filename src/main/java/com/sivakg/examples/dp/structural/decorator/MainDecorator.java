package com.sivakg.examples.dp.structural.decorator;

import com.sivakg.examples.dp.structural.decorator.impl.BasicBike;
import com.sivakg.examples.dp.structural.decorator.impl.LuxuryBike;
import com.sivakg.examples.dp.structural.decorator.impl.SportsBike;

public class MainDecorator {

	public static void main(String[] args) { 
		
		Bike basicBike=new BasicBike();
		basicBike.assembleBike();
		System.out.println("------------------");
		Bike sportsBike=new SportsBike(new BasicBike());
		sportsBike.assembleBike();
		
		System.out.println("------------------");
		Bike spLuxBike=new LuxuryBike(new SportsBike(new BasicBike()));
		spLuxBike.assembleBike();

	}

}
