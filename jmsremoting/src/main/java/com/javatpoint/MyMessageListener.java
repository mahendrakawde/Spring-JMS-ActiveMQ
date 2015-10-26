package com.javatpoint;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener{

	
	public void onMessage(Message m) {
		TextMessage message=(TextMessage)m;
		try{
			System.out.println("Start = " + message.getText());
			Thread.sleep(5000);
			System.out.println("End = " + message.getText());
		}catch (Exception e) {e.printStackTrace();	}
	}

}
