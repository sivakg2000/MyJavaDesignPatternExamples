package com.sivakg.examples.dp.creational;

public class SingletonBillPugh {

	private SingletonBillPugh() {

	}

	private static class SingletonBillPughHolder {
		private static SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	public static SingletonBillPugh getInstance() {

		return SingletonBillPughHolder.INSTANCE;
	}

}
