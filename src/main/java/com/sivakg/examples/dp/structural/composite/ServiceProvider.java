package com.sivakg.examples.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

import com.sivakg.examples.dp.structural.composite.component.Service;

public class ServiceProvider implements Service {

	private List<Service> list = new ArrayList<>();

	@Override
	public void service(String serviceType) {
		for(Service ser:list) { 
			ser.service(serviceType);
		}

	}

	public void addService(Service service) {
		list.add(service);
	}

	public void deletService(Service service) {
		list.remove(service);
	}

	public void clearService() {
		list.clear();
	}

}
