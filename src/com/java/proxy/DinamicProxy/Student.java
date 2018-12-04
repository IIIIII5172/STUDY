package com.java.proxy.DinamicProxy;

public class Student implements Person {
	private String name;
	public Student(String name){
		this.name=name;
	}
	
	@Override
	public void giveMoney() {
		try {
			//假设数钱1S
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"上交班费50元");
		
	}

	@Override
	public void fuck() {
		System.out.println("I wanna fuck");		
	}

}
