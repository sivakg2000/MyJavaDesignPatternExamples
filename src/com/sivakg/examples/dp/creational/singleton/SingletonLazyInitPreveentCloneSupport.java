package com.sivakg.examples.dp.creational.singleton; 

public class SingletonLazyInitPreveentCloneSupport implements Cloneable {
  
	private static SingletonLazyInitPreveentCloneSupport INSTANCE = null;
 

	private SingletonLazyInitPreveentCloneSupport() {

	}

	public static SingletonLazyInitPreveentCloneSupport getInstance() {
		if(INSTANCE==null)
			INSTANCE=new SingletonLazyInitPreveentCloneSupport();
		return INSTANCE;
	}
	
	
	private Object readResolve() {
		return getInstance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		return getInstance();
	}
	 

}
