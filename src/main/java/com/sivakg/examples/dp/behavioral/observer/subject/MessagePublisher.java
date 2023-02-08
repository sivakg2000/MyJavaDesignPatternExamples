package com.sivakg.examples.dp.behavioral.observer.subject;

import java.util.HashSet;
import java.util.Set;

import com.sivakg.examples.dp.behavioral.observer.Message;
import com.sivakg.examples.dp.behavioral.observer.Observer;

public class MessagePublisher implements Subject {

	private Set<Observer> observers=new HashSet<Observer>();
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void unregister(Observer observer) { 
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message msg) {
		for(Observer obs:observers) {
			 obs.updateObserver(msg);
		}

	}

}
