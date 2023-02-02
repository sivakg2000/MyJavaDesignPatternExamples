package com.sivakg.examples.dp.creational.factory.abs;

import com.sivakg.examples.dp.creational.factory.Computer;

public class MainAbsFactory {
	public static void main(String args[]) {
		
		Computer compPC=ComputerFactory.getComputer(new PCFactory( "16GB", "500GB", "4", false, false));
		System.out.println(compPC);
		
		Computer compServer=ComputerFactory.getComputer(new ServerFactory( "64GB", "2TB", "16", false, false));
		System.out.println(compServer);
		
		Computer compLaptop=ComputerFactory.getComputer(new LaptopFactory( "16GB", "1TB", "8", false, false));
		System.out.println(compLaptop);
		
		
	}

}
