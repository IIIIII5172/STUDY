package com.java.designPattern.StrategyPattern;

/**
 * 策略模式：不同的类继承同一个接口重写同一个方法，
 * 在不同场景调用需要的实现类的这个方法
 *
 */
public class text {
	public static void main(String[] args) {
		String expString="2*77";
		ICalculater calculater=new Multiply();
		System.out.println(calculater.calculate(expString));
	}
}
