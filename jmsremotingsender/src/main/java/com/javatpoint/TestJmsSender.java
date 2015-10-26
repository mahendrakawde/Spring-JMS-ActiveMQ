package com.javatpoint;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJmsSender {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationContext.xml");
		ctx.refresh();

		MyMessageSender sender = ctx.getBean("messageSender",MyMessageSender.class);
		for (int i = 1; i <= 500; i++) {
			sender.sendMessage("hello jms "+ i);
		}
	}
}
