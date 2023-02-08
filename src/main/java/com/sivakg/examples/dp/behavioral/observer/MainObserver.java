package com.sivakg.examples.dp.behavioral.observer;

import com.sivakg.examples.dp.behavioral.observer.impl.MessageSubscriberOne;
import com.sivakg.examples.dp.behavioral.observer.impl.MessageSubscriberThree;
import com.sivakg.examples.dp.behavioral.observer.impl.MessageSubscriberTwo;
import com.sivakg.examples.dp.behavioral.observer.subject.MessagePublisher;

public class MainObserver {
	public static void main(String args[]) {
		MessageSubscriberOne oneSub=new MessageSubscriberOne();
		MessageSubscriberTwo twoSub=new MessageSubscriberTwo();
		MessageSubscriberThree threeSub=new MessageSubscriberThree();
		
		MessagePublisher msgPub=new MessagePublisher();
		
		msgPub.register(oneSub);
		msgPub.register(twoSub);
		
		msgPub.notifyUpdate(new Message("First Msg"));
		msgPub.unregister(oneSub);
		msgPub.register(threeSub);
		msgPub.notifyUpdate(new Message("Second Msg"));
	}
	
}
