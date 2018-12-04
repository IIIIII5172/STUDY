package com.java.designPattern.FactoryPattern;

import com.java.proxy.staticProxy.staticProxyTest;

public class SenderFactory {
	/*//工厂模式简单实现     创建对象用一个方法，用变量区别创建哪个类型的对象。输入字符串有误时不能创建对象。
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}
		else if("QQ".equals(type)){
			return new QQSender();
		}else{
			System.out.println("请输入正确类型");
			return null;
		}
	}*/
	
	/*
	//多个工厂模式  创建每个类型的对象都有单独的方法
	public Sender prodeceMail(){
		return new MailSender();
	}
	public Sender produceQQ(){
		return new QQSender();
	}	*/
	
	//静态工厂  将创建工厂的方法变为静态方法
	public static Sender prodeceMail(){
		return new MailSender();
	}
	public static Sender produceQQ(){
		return new QQSender();
	}	
	
}
