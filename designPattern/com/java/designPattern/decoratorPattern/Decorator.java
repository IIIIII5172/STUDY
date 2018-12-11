package com.java.designPattern.decoratorPattern;

/**
 *装饰模式：
 *Source是被装饰的类
 *装饰类Decorator和Source实现同一个接口，然后拿到一个Source对象进行修饰
 *
 *和静态代理类似？？？（区别写在代理模式里了）
 *
 */
public class Decorator implements Sourceable{
	private Sourceable source;
	public Decorator(Sourceable source){
		this.source=source;
	} 
	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
	

}
