package com.sivakg.examples.dp.behavioral.observer.subject;

import com.sivakg.examples.dp.behavioral.observer.Message;
import com.sivakg.examples.dp.behavioral.observer.Observer;

public interface Subject {

	public void register(Observer observer );
	public void unregister(Observer observer );
	public void notifyUpdate(Message msg );
}
