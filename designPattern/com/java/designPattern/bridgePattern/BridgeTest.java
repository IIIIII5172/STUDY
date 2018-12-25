package com.java.designPattern.bridgePattern;

/**
 * 桥接模式
 *
 */
public class BridgeTest {
	
	public static void main(String[] args) {
		Bridge bridge=new MyBridge();
		
		Sourceable S1=new SourceSub1();
		bridge.setSource(S1);;
		bridge.method();
		
		Sourceable S2=new SourceSub2();
		bridge.setSource(S2);;
		bridge.method();
	}
	
	
}
