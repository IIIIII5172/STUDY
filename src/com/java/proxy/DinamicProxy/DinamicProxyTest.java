package com.java.proxy.DinamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//动态代理无需再代理类配置指定被代理对象和方法，只需配置invocationHandler
//动态代理只能代理接口，即被代理实现的对象必须继承某个接口
//invocatonHandler如何修饰被代理对象的不同方法
public class DinamicProxyTest {
	
	public static void main(String[] args){
		//被代理的对象
		Person daiyong=new Student("代勇");
		
		//创建 与代理对象相关联的 invocationHandler
		InvocationHandler handler=new StudentInvocatoinHandler<Person>(daiyong);
		
		Person sunxinghua = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), 
															new Class<?>[]{Person.class},
															handler);
		//代理执行方法
		sunxinghua.giveMoney();
		sunxinghua.fuck();
	}
}
