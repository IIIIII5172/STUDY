package com.java.designPattern.ObserverPattern;

public class MySubject extends AbstractSubject{

	@Override
	public void operations() {
		System.out.println("update myself!");
		notifyAllObservers();
	}
	

}
