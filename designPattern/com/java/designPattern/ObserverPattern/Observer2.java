package com.java.designPattern.ObserverPattern;

public class Observer2 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer2 知道subject新增了!");
	}

}
