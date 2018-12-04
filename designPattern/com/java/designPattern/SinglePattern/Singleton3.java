package com.java.designPattern.SinglePattern;


/**
 * 使用静态内部类来实现单例模式
 *静态内部类虽然保证了单例在多线程并发下的线程安全性，但是在遇到序列化对象时，默认的方式运行得到的结果就是多例的
 *上面这句话是啥意思我TM也不知道，序列化没看过
 */
public class Singleton3 {
	// 私有构造
    private Singleton3() {}
    //静态内部类
    private static class Singletonfactory{
    	private static Singleton3 instance=new Singleton3();
    }
    /* 获取实例 */  
    public static Singleton3 getInstance() {  
        return Singletonfactory.instance;  
    }
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
}


