package com.sivakg.examples.dp.structural.adapter;

import com.sivakg.examples.dp.structural.adapter.impl.MobileAdaptorImpl;
import com.sivakg.examples.dp.structural.adapter.impl.WallSocketImpl;
import com.sivakg.examples.dp.structural.adapter.model.Volt;

public class MainAdapter {
	
	public static void main(String args[]) {
		
		WallSocket wSocket=new WallSocketImpl();
		Volt v240=wSocket.getVolts();
		System.out.println(v240);
		
		
		MobileAdapter mAdapter=new MobileAdaptorImpl(wSocket);
		Volt v3=mAdapter.get3Volts();
		System.out.println(v3);
		
	}

}
