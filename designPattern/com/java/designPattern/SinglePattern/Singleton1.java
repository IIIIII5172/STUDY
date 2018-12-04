package com.java.designPattern.SinglePattern;

/**
 *单例模式涉及线程安全、序列化等比较麻烦
 *单例模式-第一种实现方法
 *饿汉式单例在类加载初始化时就创建好一个静态的对象供外部使用，除非系统重启，这个对象不会改变，
 *所以本身就是线程安全的。
 *Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，
 *Singleton的唯一实例只能通过getInstance()方法访问。
 *
 *
 *单例模式后续内容
 *https://blog.csdn.net/a394268045/article/details/51801258
 *https://www.cnblogs.com/garryfu/p/7976546.html
 */
public class Singleton1 {
	
	//私有构造不能被new  防止自己被new出来导致创建多个对象(不写的话默认是public，其他地方可以访问导致可以new出来)
	private Singleton1(){}
	//将new出来的对象作为一个静态变量，所以全局只有一个对象。
	private static Singleton1 single=new Singleton1();
	
	//其他地方访问该对象的方法，的到的对象是全局这一个变量。
	public static Singleton1 getInstance(){
		return single;
	}
}
