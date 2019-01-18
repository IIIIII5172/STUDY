package com.java.designPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//暂时不知道怎么判断list是否有新增，先用vector和Enumeration了
public abstract class AbstractSubject implements Subject{
	
//	private Vector<Observer> vector=new Vector<Observer>();
	private List<Observer> list =new ArrayList<Observer>();
	
	@Override
	public void add(Observer observer){
		list.add(observer);
	}
	
	@Override
	public void del(Observer observer) {
		list.remove(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		/*Enumeration<Observer> enumer=vector.elements();
		while(enumer.hasMoreElements()){
			enumer.nextElement().update();
		}*/
		Iterator<Observer> it=list.iterator();
		while (it.hasNext()) {
			it.next().update();
		}
	}
	
}
