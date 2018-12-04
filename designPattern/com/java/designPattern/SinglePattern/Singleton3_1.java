package com.java.designPattern.SinglePattern;

/**
 * 静态代码块
 *
 */
public class Singleton3_1 {
//	 私有构造
    private Singleton3_1() {}
    
    private static Singleton3_1 single = null;

    // 静态代码块
    static{
        single = new Singleton3_1();
    }
    
    public static Singleton3_1 getInstince(){
        return single;
    }
}
