package com.java.designPattern.SinglePattern;

/**
 * 为了解决线程安全问题，给getInstince加了个synchronized
 *这样加性能低。因为每次都要等这个方法释放锁之后别的线程才能得到锁，但
 *实际上只有第一次执行getInstince的时候需要锁来保证全局只创建了一个对象
 */
public class Singleton2_1 {
	private Singleton2_1() {}

	private static Singleton2_1 instance = null;

	public static synchronized Singleton2_1 getInstance() {
		if (instance == null) {
			instance = new Singleton2_1();
		}
		return instance;
	}

}
