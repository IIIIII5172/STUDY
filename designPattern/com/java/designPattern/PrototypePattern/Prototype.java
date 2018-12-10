package com.java.designPattern.PrototypePattern;

/**
 * 原型模式看不大懂
 * 回头再看
 *
 */
public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException{
		Prototype proto= (Prototype) super.clone();
		return proto;
	}
}
