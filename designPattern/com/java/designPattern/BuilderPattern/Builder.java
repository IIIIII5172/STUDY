package com.java.designPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<Sender> list=new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	
	public void produceQQSender(int count){
		for(int i=0;i<count;i++){
			list.add(new QQSender());
		}
	}
}
