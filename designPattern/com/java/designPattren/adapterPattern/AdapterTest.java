package com.java.designPattren.adapterPattern;

/**
 * 类的适配器模式（对象的适配器模式和接口的适配器模式写在别的地方了）
 * Adapter继承Source类实现targetable接口，
 * 拿到Source类的method1方法和实现targetable接口的method2方法
 * 
 * 也就是说Source是待适配的，用一个新的类来给Sourc适配一个方法
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		Targetable target=new Adapter();
		target.method1();
		target.method2();
		
		
		Wrapper aa=new Wrapper(new Source());//对象的适配器模式
	}
	
}
