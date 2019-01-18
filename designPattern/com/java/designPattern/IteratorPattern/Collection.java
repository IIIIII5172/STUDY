package com.java.designPattern.IteratorPattern;


public interface Collection {
	public Iterator itreator();
	
	public Object get(int i);
	
	public int size();
	
}
