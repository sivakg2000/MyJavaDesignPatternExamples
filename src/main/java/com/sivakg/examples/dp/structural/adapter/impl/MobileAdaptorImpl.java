package com.sivakg.examples.dp.structural.adapter.impl;

import com.sivakg.examples.dp.structural.adapter.MobileAdapter;
import com.sivakg.examples.dp.structural.adapter.WallSocket;
import com.sivakg.examples.dp.structural.adapter.model.Volt;

public class MobileAdaptorImpl implements MobileAdapter {
	
	
	private WallSocket wallSocket;
	
	
	

	public MobileAdaptorImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}




	@Override
	public Volt get3Volts() { 
		Volt v240=this.wallSocket.getVolts();
		Volt v3=new Volt(v240.getVolts()/8);
		return v3;
	}

}
