package com.sivakg.examples.dp.creational.singleton;

public class SingletonEagerInit {

	//Singleton Eager Initialization
	private static final SingletonEagerInit INSTANCE = new SingletonEagerInit();

	private SingletonEagerInit() {

	}

	public static SingletonEagerInit getInstance() {
		return INSTANCE;
	}

}
