package com.sivakg.examples.dp.structural.proxy.impl;

import com.sivakg.examples.dp.structural.proxy.VeryExpensiveProcess;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {
	
	
	public   VeryExpensiveProcessImpl() {
		this.heavyInitalConfigurationSetup(); 
	}

	@Override
	public void process() {
		System.out.println("Process is done");
		
	}
	
	private void heavyInitalConfigurationSetup() {
		System.out.println("Setting up inital configurations");
	}

}
