package com.sivakg.examples.dp.structural.composite.leaf;

import com.sivakg.examples.dp.structural.composite.component.Service;

public class EmployeeService implements Service {

	@Override
	public void service(String serviceType) {

		System.out.println(serviceType + " for Employee");

	}

}
