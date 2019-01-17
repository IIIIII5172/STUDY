package com.java.designPattern.ObserverPattern;

public class Observer1 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer1 知道subject新增了");
	}

}
