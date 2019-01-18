package com.java.designPattern.IteratorPattern;

public interface Iterator {
	//前移
	public Object previous();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}
