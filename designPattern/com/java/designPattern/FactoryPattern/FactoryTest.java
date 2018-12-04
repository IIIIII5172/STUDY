package com.java.designPattern.FactoryPattern;


public class FactoryTest {
	/*//简单工厂模式测试    
	public static void main(String[] args) {
		SenderFactory factory=new SenderFactory();
		Sender sender=factory.produce("QQ");
		sender.send();
	}*/
	
	/*//多个工厂模式测试
	public static void main(String[] args) {
		SenderFactory factory=new SenderFactory();
		Sender sender=factory.prodeceMail();
		sender.send();
	}*/
	
	//静态工厂模式测试
	public static void main(String[] args) {
		Sender sender=SenderFactory.produceQQ();
		sender.send();
	}
}
