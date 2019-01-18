package com.java.designPattern.CommandPattern;

/**
 * 命令模式
 * 没啥好说的
 *
 */
public class test {
	public static void main(String[] args) {
		Receiver receiver=new Receiver();
		Command cmd=new Mycommand(receiver);
		Invoker invoker=new Invoker(cmd);
		invoker.action();
	}
}
