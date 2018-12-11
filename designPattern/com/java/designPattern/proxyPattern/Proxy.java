package com.java.designPattern.proxyPattern;

/**
 * 代理模式（静态代理）
 * 跟装饰模式类似
 * 不同点：代理模式在代理类就把被代理的对象new出来，
 * 而装饰模式在装饰类实例化的时候从外部拿到被装饰类的实例。
 * 
 * 也就是说装饰模式是对被装饰对象实例的扩展，而代理模式是对被代理类的扩展。
 *
 */
public class Proxy implements Sourceable{
	private Source source;
	public Proxy(){
		this.source=new Source();
	}
	@Override
	public void method() {
		before();
		this.source.method();
		after();
	}
	
	private void before(){
		System.out.println("before proxy!");
	}
	private void after(){
		System.out.println("after proxy!");
	}

}
