package com.sivakg.examples.dp.creational;

public class MainCreationalMain {

	public static void main(String arg[]) {
		SingletonEagerInit singleEObj=SingletonEagerInit.getInstance();
		SingletonEagerInit singleEObj1=SingletonEagerInit.getInstance();
		System.out.println(singleEObj.hashCode());
		System.out.println(singleEObj1.hashCode());
		
		SingletonStaticInit singleSObj=SingletonStaticInit.getInstance();
		SingletonStaticInit singleSObj1=SingletonStaticInit.getInstance();
		System.out.println(singleSObj.hashCode());
		System.out.println(singleSObj1.hashCode());
		
		
		SingletonLazyInit singleLObj=SingletonLazyInit.getInstance();
		SingletonLazyInit singleLObj1=SingletonLazyInit.getInstance();
		System.out.println(singleLObj.hashCode());
		System.out.println(singleLObj1.hashCode());


	}
}
