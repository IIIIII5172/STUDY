package com.java.designPattern.MementoPattern;

/**
 * 备忘录模式
 *
 */
public class test {
	public static void main(String[] args) {
		Original original=new Original("egg");
		
		Storage storage=new Storage(original.createMemento());
		
		System.out.println("初始化value为："+original.getValue());
		original.setValue("shit");
		System.out.println("更改后value为："+original.getValue());
		
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后value为"+original.getValue());
	}
}
