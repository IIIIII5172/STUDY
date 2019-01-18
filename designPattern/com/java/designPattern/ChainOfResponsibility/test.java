package com.java.designPattern.ChainOfResponsibility;

/**
 * 责任链模式
 * operator方法一层层往下调
 *
 */
public class test {
	public static void main(String[] args) {
		MyHandler m1=new MyHandler("h1");
		MyHandler m2=new MyHandler("h2");
		MyHandler m3=new MyHandler("h3");
		MyHandler m4=new MyHandler("h4");
		
		m1.setHandler(m2);
		m2.setHandler(m3);
		m3.setHandler(m4);
		
		m1.operator();
	}
}
