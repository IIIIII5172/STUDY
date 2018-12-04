package com.java.simpleThreadTest;


public class Main {
	public static void main(String[] args){
		sellTicket st=new sellTicket();
		
		Thread threadA=new Thread(st, "窗口A");
		Thread threadB=new Thread(st, "窗口B");
		Thread threadC=new Thread(st, "窗口C");
		
		threadA.start();
		threadB.start();
		threadC.start();
	}
	
}
