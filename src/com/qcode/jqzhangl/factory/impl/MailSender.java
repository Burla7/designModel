package com.qcode.jqzhangl.factory.impl;

import com.qcode.jqzhangl.factory.Sender;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is MailSender");
	}

}
