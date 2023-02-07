package com.sivakg.examples.dp.structural.proxy.impl;

import com.sivakg.examples.dp.structural.proxy.VeryExpensiveProcess;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {
	
	
	public static VeryExpensiveProcessImpl vxpImpl=null;

	@Override
	public void process() {
		if(vxpImpl==null)
			vxpImpl=new VeryExpensiveProcessImpl();
		vxpImpl.process();
		
	}
	
	 
}
