package com.sivakg.examples.dp.structural.adapter.impl;

import com.sivakg.examples.dp.structural.adapter.WallSocket;
import com.sivakg.examples.dp.structural.adapter.model.Volt;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() { 
		return new Volt(240);
	}

}
