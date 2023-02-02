package com.sivakg.examples.dp.creational.builder;

public class MainBuilder {

	public static void main(String args[]) {
		Laptop loptop=new Laptop.LaptopBuilder("16GB", "500GB", "4").build();
		System.out.println(loptop);
		
		Laptop loptop1=new Laptop.LaptopBuilder("16GB", "500GB", "4").setBluetoothEnabled(true).setGraphicsEnabled(true).build();
		System.out.println(loptop1);
	}
}
