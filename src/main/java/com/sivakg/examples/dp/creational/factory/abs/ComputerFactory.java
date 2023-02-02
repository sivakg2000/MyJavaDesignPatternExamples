package com.sivakg.examples.dp.creational.factory.abs;

import com.sivakg.examples.dp.creational.factory.Computer;

public class ComputerFactory {
	private ComputerFactory() {

	}

	public static Computer getComputer(AbstractComputerFactory abstractCF) {
		return abstractCF.createComputer();

	}

}
