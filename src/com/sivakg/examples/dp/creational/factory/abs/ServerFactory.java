package com.sivakg.examples.dp.creational.factory.abs;

import com.sivakg.examples.dp.creational.factory.Computer;
import com.sivakg.examples.dp.creational.factory.impl.Server;

public class ServerFactory implements AbstractComputerFactory {

	public String ram;
	public String hdd;
	public String cpu;

	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;
	
	
	/**
	 * 
	 * @param ram
	 * @param hdd
	 * @param cpu
	 * @param isGraphicsEnabled
	 * @param isBluetoothEnabled
	 */

	public ServerFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	@Override
	public Computer createComputer() { 
		return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}

}
