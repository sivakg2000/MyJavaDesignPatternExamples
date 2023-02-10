package com.sivakg.examples.dp.structural.decorator;

import com.sivakg.examples.dp.structural.decorator.impl.BasicBike;
import com.sivakg.examples.dp.structural.decorator.impl.LuxuryBike;
import com.sivakg.examples.dp.structural.decorator.impl.SportsBike;

public class MainDecorator {

	public static void main(String[] args) { 
		
		Bike basicBike=new BasicBike();
		basicBike.assembleBike();
		Bike sportsBike=new SportsBike(basicBike);
		sportsBike.assembleBike();
		
		Bike spLuxBike=new LuxuryBike(sportsBike);
		spLuxBike.assembleBike();

	}

}
