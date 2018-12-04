package com.java.designPattern.SinglePattern;

public class test implements Runnable{
	public Singleton2 getS(){
		return Singleton2.getInstance();
	}
	@Override
	public void run() {
		getS();
	}
	
	public static void main(String[] args) {
		test te=new test();
		Thread T1=new Thread(te);
		Thread T2=new Thread(te);
		
	}
	
}
