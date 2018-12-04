package com.java.proxy.staticProxy;
//静态代理，代理实现类StudentProxy写死，StudentProxy只能代理Srudent类，里面的方法也写死
public class staticProxyTest {
	public static void main(String[] args) {
		//被代理对象
		Person daiyong=new Student("代勇");
		
		//生成代理对象
		Person sunxinghua= new StudentProxy(daiyong);
		
		// 代理执行
		sunxinghua.giveMoney();
	}

}
