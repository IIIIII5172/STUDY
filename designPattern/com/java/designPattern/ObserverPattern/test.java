package com.java.designPattern.ObserverPattern;


/** subject是一个被观察对象，Observe1和observe2是两个观察者。
 * 当subject发生了更新时，其观察者收到通知。
 * 
 * mysubject对象调add方法 给vector添加对象，然后调operation输出并调notifyallobservers方法
 * notifyallobservers方法拿出新增的observer对象调它的update方法，输出
 *
 */
public class test {
	public static void main(String[] args) {
		Subject sb=new MySubject();
		sb.add(new Observer1());
		sb.add(new Observer2());
		sb.operations();
		
	}
}
