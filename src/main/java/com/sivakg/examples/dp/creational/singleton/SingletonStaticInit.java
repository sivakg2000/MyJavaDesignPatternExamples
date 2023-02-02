package com.sivakg.examples.dp.creational.singleton;

public class SingletonStaticInit {
 
	private static SingletonStaticInit INSTANCE = null;
	static {
		try {
			if(INSTANCE==null)
				INSTANCE=new SingletonStaticInit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private SingletonStaticInit() {

	}

	public static SingletonStaticInit getInstance() {
		return INSTANCE;
	}

}
