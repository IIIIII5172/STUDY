package com.java.designPattern.CommandPattern;

public class Mycommand implements Command{
	private Receiver receiver;
	public Mycommand(Receiver receiver){
		this.receiver=receiver;
	}
	@Override
	public void exe() {
		receiver.action();
	}

}
