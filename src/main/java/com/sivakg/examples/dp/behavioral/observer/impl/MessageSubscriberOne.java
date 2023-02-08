package com.sivakg.examples.dp.behavioral.observer.impl;

import com.sivakg.examples.dp.behavioral.observer.Message;
import com.sivakg.examples.dp.behavioral.observer.Observer;

public class MessageSubscriberOne implements Observer {

	@Override
	public void updateObserver(Message msg) {
		 System.out.println("Msg from MessageSubscriberOne: "+msg.getMessage());

	}

}
