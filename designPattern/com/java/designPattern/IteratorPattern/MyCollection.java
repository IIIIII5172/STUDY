package com.java.designPattern.IteratorPattern;


public class MyCollection implements Collection{
	public String string[]={"A","B","C","D","E"};
	@Override
	public Iterator itreator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}
	

}
