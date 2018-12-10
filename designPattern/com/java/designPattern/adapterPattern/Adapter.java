package com.java.designPattern.adapterPattern;

public class Adapter extends Source implements Targetable{
	
	@Override
	public void method2() {
		System.out.println("This is the targetable method!");
		
	}
	//因为继承父类Source已经有个method1了，可以不用再重写这个方法了
	/*public void method1(){
		System.out.println("AAAAAAAAAAAAAAA");
	}*/
}
