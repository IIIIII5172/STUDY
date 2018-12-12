package com.java.designPattern.facadePattern;

/**
 * 外观模式
 * 没啥可看的
 *
 */
public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu=new CPU();
		memory=new Memory();
		disk=new Disk();
	}
	
	public void startup(){
		System.out.println("Start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("Start thr computer finished!");
	}
	public void shutdown(){
		System.out.println("close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("The computer closed");
	}
	
}
