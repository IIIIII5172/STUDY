package com.java.designPattern.SinglePattern;

/**
 * 把synchronized放在内部，当instance为空时才加锁
 * 但其实还是不安全的
 * 详见https://blog.csdn.net/a394268045/article/details/51801258
 *
 */
public class Singleton2_2 {
	private Singleton2_2() {
	}

	private static Singleton2_2 instance = null;

	public static synchronized Singleton2_2 getInstance() {
		if(instance==null){
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton2_2();
				}
			}
		}
		return instance;
	}
}
