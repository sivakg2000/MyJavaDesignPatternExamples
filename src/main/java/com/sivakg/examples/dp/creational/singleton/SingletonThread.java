package com.sivakg.examples.dp.creational.singleton;

public class SingletonThread implements Runnable {

	@Override
	public void run() {
		SingletonThreadSafe singleTSWTSObj=SingletonThreadSafe.getInstanceWOTS();
		System.out.println(Thread.currentThread().getName()+" WO-TS "+singleTSWTSObj.hashCode());
		
		
		SingletonThreadSafe singleTSSObj=SingletonThreadSafe.getInstanceS();
		
		System.out.println(Thread.currentThread().getName()+" W-TS "+singleTSSObj.hashCode());
		
		
		SingletonThreadSafe singleTSDSObj=SingletonThreadSafe.getInstance();
		System.out.println(Thread.currentThread().getName()+" W-TSDS "+singleTSDSObj.hashCode());
		
	}

}
