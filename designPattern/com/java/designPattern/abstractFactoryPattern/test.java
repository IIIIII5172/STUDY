package com.java.designPattern.abstractFactoryPattern;

/**
 * 抽象工厂：
 * 所有工厂也继承一个接口
 * 扩展性比较好
 *
 */
public class test {
	public static void main(String[] args) {
		Provider provider =new QQSenderFactory();
		Sender sender=provider.produce();
		sender.send();
	}
}
