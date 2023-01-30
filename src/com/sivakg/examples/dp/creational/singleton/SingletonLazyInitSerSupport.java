package com.sivakg.examples.dp.creational.singleton;

import java.io.Serializable;

public class SingletonLazyInitSerSupport implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 256945758312466424L;
	private static SingletonLazyInitSerSupport INSTANCE = null;
 

	private SingletonLazyInitSerSupport() {

	}

	public static SingletonLazyInitSerSupport getInstance() {
		if(INSTANCE==null)
			INSTANCE=new SingletonLazyInitSerSupport();
		return INSTANCE;
	}
	
	
	private Object readResolve() {
		return getInstance();
	}
	

}
