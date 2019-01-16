package com.java.designPattern.TemplatePattern;

/**
 * 所有方法写在一个抽象类里，将变动的方法写成抽象方法
 * 想改变某个方法 的时候继承抽象类重写抽象方法
 *
 */
public class test {
	public static void main(String[] args) {
		String str="12+12";
		AbstractCalculater calculater=new Plus();
		System.out.println(calculater.calculate(str, "\\+"));
	}
}
