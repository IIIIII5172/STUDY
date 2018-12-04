package com.java.simpleThreadTest;
//简单的实现runnable接口
//对方法加锁synchroized
//线程阻塞wait后该线程释放锁
//线程就绪状态后随机一个线程得到资源run
public class sellTicket implements Runnable{
	private int ticketsNum=100;
	
	@Override
	public void run() {
		try {
			this.sellTicket();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private synchronized void sellTicket() throws InterruptedException{
		while(this.ticketsNum>=0){
			if(ticketsNum==0){
				return;
			}
			this.notifyAll();
			Thread.sleep(50);
			System.out.println(Thread.currentThread().getName()+"还剩"+(--ticketsNum)+"票");
			this.wait();
			
		}
		
	}
	

}
