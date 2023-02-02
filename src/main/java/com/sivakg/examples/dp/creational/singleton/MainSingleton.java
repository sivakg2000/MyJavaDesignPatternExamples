package com.sivakg.examples.dp.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author skaruppiah
 *
 */
public class MainSingleton {

	public static void main(String arg[]) {
		SingletonEagerInit singleEObj=SingletonEagerInit.getInstance();
		SingletonEagerInit singleEObj1=SingletonEagerInit.getInstance();
		System.out.println("E I "+singleEObj.hashCode());
		System.out.println("E I "+singleEObj1.hashCode());
		
		SingletonStaticInit singleSObj=SingletonStaticInit.getInstance();
		SingletonStaticInit singleSObj1=SingletonStaticInit.getInstance();
		System.out.println("S I "+singleSObj.hashCode());
		System.out.println("S I "+singleSObj1.hashCode());
		
		
		SingletonLazyInit singleLObj=SingletonLazyInit.getInstance();
		SingletonLazyInit singleLObj1=SingletonLazyInit.getInstance();
		System.out.println("L I "+singleLObj.hashCode());
		System.out.println("L I "+singleLObj1.hashCode());
		
		ExecutorService exeService = null;
		SingletonThread myThread=new SingletonThread();
		try {
			exeService=Executors.newFixedThreadPool(3);
			exeService.execute(myThread);
			exeService.execute(myThread);
			exeService.execute(myThread);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(exeService!=null)
				exeService.shutdown();
		}
		
		
		
		SingletonBillPugh singleBPObj=SingletonBillPugh.getInstance();
		SingletonBillPugh singleBPObj1=SingletonBillPugh.getInstance();
		System.out.println(singleBPObj.hashCode());
		System.out.println(singleBPObj1.hashCode());
		
		Constructor<?>[] constructors= SingletonLazyInit.class.getDeclaredConstructors();
		for(Constructor<?> construt:constructors) {
			construt.setAccessible( true);
			try {
				Object obj=construt.newInstance();
				singleLObj1=(SingletonLazyInit)obj;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("S D "+singleLObj.hashCode());
		System.out.println("S D "+singleLObj1.hashCode());
		
		
		SingletonEnum singleENObj=SingletonEnum.GETINSTANCE;
		SingletonEnum singleENObj1=SingletonEnum.GETINSTANCE;
		System.out.println("EN I "+singleENObj.hashCode());
		System.out.println("EN I "+singleENObj1.hashCode());

		
		SingletonLazyInitSerSupport singleLSWSObj=SingletonLazyInitSerSupport.getInstance();
		SingletonLazyInitSerSupport singleLSWSObj1=null;
		
		
		
		ObjectOutputStream objOS=null;
		ObjectInputStream objIS=null;
		
		try {
			objOS=new ObjectOutputStream(new FileOutputStream("singletonobj.ser"));
			objOS.writeObject(singleLSWSObj);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(objOS!=null)
				try {
					objOS.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		try {
			objIS=new ObjectInputStream(new FileInputStream("singletonobj.ser"));
			Object readObj=objIS.readObject();
			singleLSWSObj1=(SingletonLazyInitSerSupport)readObj;
			 
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(objOS!=null)
				try {
					objOS.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
		

		System.out.println("LSWS I "+singleLSWSObj.hashCode());
		System.out.println("LSWS I "+singleLSWSObj1.hashCode());
		
		
		
		SingletonLazyInitPreveentCloneSupport singleLCNSObj=SingletonLazyInitPreveentCloneSupport.getInstance();
		SingletonLazyInitPreveentCloneSupport singleLCNSObj1=null;
		try {
			 singleLCNSObj1=(SingletonLazyInitPreveentCloneSupport) singleLCNSObj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("LCNS I "+singleLCNSObj.hashCode());
		System.out.println("LCNS I "+singleLCNSObj1.hashCode());

	}
}
