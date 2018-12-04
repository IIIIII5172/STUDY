package com.java.designPattern.abstractFactoryPattern;

public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
