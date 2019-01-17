package com.java.designPattern.ObserverPattern;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	
	private Vector<Observer> vector=new Vector<Observer>();
	
	@Override
	public void add(Observer observer){
		vector.add(observer);
	}
	
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		
		Enumeration<Observer> enumer=vector.elements();
		while(enumer.hasMoreElements()){
			enumer.nextElement().update();
		}
	}
	
}
