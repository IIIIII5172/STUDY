package com.java.proxy.staticProxy;

public class StudentProxy implements Person{
	//被代理的学生
	Student student1;
	
	public StudentProxy(Person stu){
		//只代理学生对象
		if(stu.getClass()==Student.class){
			this.student1=(Student)stu;
		}
	}
	
	public void giveMoney(){
		System.out.println("代理执行");
		student1.giveMoney();
	}
}
