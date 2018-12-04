package com.java.designPattern.abstractFactoryPattern;

public class MailSender implements Sender {

	@Override
	public void send() {
		 System.out.println("this is MailSender!");  

	}

}
