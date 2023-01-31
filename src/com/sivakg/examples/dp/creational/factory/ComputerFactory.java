package com.sivakg.examples.dp.creational.factory;
 

import com.sivakg.examples.dp.creational.factory.impl.Laptop;
import com.sivakg.examples.dp.creational.factory.impl.PC;
import com.sivakg.examples.dp.creational.factory.impl.Server;

/**
 * 
 * @author skaruppiah
 *
 */

public class ComputerFactory {


	
	private ComputerFactory() {
		
	}
	
	
	public static Computer getComputer(ComputerType type,String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		
		switch(type) {
		case PC:
			return new PC( ram,  hdd,  cpu,  isGraphicsEnabled,  isBluetoothEnabled);
		case SERVER:
			return new Server( ram,  hdd,  cpu,  isGraphicsEnabled,  isBluetoothEnabled);
		case LAPTOP:
			return new Laptop( ram,  hdd,  cpu,  isGraphicsEnabled,  isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid Computer Type :"+type);
		
		} 
		
	}
}
