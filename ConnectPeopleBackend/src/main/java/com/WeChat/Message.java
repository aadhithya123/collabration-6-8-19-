package com.WeChat;

public class Message
{
	private String message;
	private int messageid;
	
	public Message()
	{
		
	}
	
	public Message(int messageid,String message)
	{
		this.message=message;
		this.messageid=messageid;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	
}
