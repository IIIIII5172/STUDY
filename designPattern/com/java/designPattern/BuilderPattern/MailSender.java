package com.java.designPattern.BuilderPattern;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("This is a MailSender");

	}

}
