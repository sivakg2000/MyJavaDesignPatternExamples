package com.sivakg.examples.dp.creational.singleton;

public class SingletonThreadSafe {
 
	private static SingletonThreadSafe INSTANCE = null;
	 
	private SingletonThreadSafe() {

	}

	public static synchronized SingletonThreadSafe getInstanceS() {

		if(INSTANCE==null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			INSTANCE=new SingletonThreadSafe();
		}
		return INSTANCE;
	}
	
	
	public static SingletonThreadSafe getInstance() {

		if(INSTANCE==null) {
			synchronized (SingletonThreadSafe.class) {
				if(INSTANCE==null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) { 
						e.printStackTrace();
					}
					INSTANCE=new SingletonThreadSafe();
				}
				
			}
			
		}
		return INSTANCE;
	}
	
	public static SingletonThreadSafe getInstanceWOTS() {
		
		if(INSTANCE==null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			INSTANCE=new SingletonThreadSafe();
		}
		return INSTANCE;
	}

}
