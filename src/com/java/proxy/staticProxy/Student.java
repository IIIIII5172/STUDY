package com.java.proxy.staticProxy;

public class Student implements Person {
	private String name;
	public Student(String name){
		this.name=name;
	}
	
	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub
		System.out.println(name+"上交50元");
	}

}
