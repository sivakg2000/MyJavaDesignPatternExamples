package com.sivakg.examples.dp.creational.builder;

import com.sivakg.examples.dp.creational.factory.Computer;

/**
 * 
 * @author skaruppiah
 *
 */
public class Laptop  {

	public String ram;
	public String hdd;
	public String cpu;

	public boolean isGraphicsEnabled;
	public boolean isBluetoothEnabled;
	
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Laptop(LaptopBuilder builder) {
		this.ram=builder.ram;
		this.hdd=builder.hdd;
		this.cpu=builder.cpu;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
		this.isGraphicsEnabled=builder.isGraphicsEnabled;
		
	
	}
	
	
	
	
 
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}





	public static class LaptopBuilder{


		public String ram;
		public String hdd;
		public String cpu;

		public boolean isGraphicsEnabled;
		public boolean isBluetoothEnabled;
		 
		public LaptopBuilder(String ram, String hdd, String cpu) {
			super();
			this.ram=ram;
			this.hdd=hdd;
			this.cpu=cpu;
		}

		public LaptopBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Laptop build() {
			return new Laptop(this);
		}
		
		
		
		
	}
	
	

}
