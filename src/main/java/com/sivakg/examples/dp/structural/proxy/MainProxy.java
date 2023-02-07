package com.sivakg.examples.dp.structural.proxy;

import com.sivakg.examples.dp.structural.proxy.impl.VeryExpensiveProcessProxy;

public class MainProxy {

	
	public static void main(String args[]) {
		
		VeryExpensiveProcessProxy vxpProxy=new VeryExpensiveProcessProxy();
		vxpProxy.process();
		vxpProxy.process();
	}
	
}
