package com.java.designPattern.IteratorPattern;

/**
 * 迭代子模式
 *以迭代器为例
 */
public class test {
	public static void main(String[] args) {
		Collection collection=new MyCollection();
		Iterator it=collection.itreator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
