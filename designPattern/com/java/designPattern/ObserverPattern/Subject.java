package com.java.designPattern.ObserverPattern;

public interface Subject {
	public void add(Observer observer);
	
	public void del(Observer observer);
	
	public void notifyAllObservers();
	//自身操作
	public void operations();
	
}
