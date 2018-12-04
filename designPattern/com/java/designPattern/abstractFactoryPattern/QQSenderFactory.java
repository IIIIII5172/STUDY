package com.java.designPattern.abstractFactoryPattern;

public class QQSenderFactory implements Provider{

	@Override
	public Sender produce() {
		return new QQSender();
	}
}
