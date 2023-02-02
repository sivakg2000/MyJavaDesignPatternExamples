package com.sivakg.examples.dp.creational.factory;

public class MainFactory {
	public static void main(String args[]) {
		
		Computer compPC=ComputerFactory.getComputer(ComputerType.PC, "16GB", "500GB", "4", false, false);
		System.out.println(compPC);
		
		Computer compServer=ComputerFactory.getComputer(ComputerType.SERVER, "64GB", "2TB", "16", false, false);
		System.out.println(compServer);
		
		Computer compLaptop=ComputerFactory.getComputer(ComputerType.LAPTOP, "16GB", "1TB", "8", false, false);
		System.out.println(compLaptop);
		
		
	}

}
