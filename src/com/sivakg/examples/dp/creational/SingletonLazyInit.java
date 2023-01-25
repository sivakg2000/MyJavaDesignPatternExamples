package com.sivakg.examples.dp.creational;

public class SingletonLazyInit {
 
	private static SingletonLazyInit INSTANCE = null;
	 
	private SingletonLazyInit() {

	}

	public static SingletonLazyInit getInstance() {
		if(INSTANCE==null)
			INSTANCE=new SingletonLazyInit();
		return INSTANCE;
	}

}
