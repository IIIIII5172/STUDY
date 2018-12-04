package com.java.proxy.DinamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocatoinHandler<T> implements InvocationHandler {
	//invocationHandler持有的被代理对象
	T target;
	public StudentInvocatoinHandler(T target) {
		this.target=target;
	}
	 /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println(proxy.getClass()+"代理执行"+method.getName()+"方法");
		//插入监测方法，计算耗时
		MonitorUtil.start();
		//执行代理对象的方法
		Object result = method.invoke(target, args);
		System.out.println("执行完毕");
		MonitorUtil.finish(method.getName());
		return result;
	}
}
