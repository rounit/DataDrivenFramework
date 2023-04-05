package com.rs.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.rs.utilities.MonitoringMail;
import com.rs.utilities.TestConfig;

public class TestHoldAdd {

	public static void main(String[] args) throws UnknownHostException, AddressException, MessagingException 
	{
		MonitoringMail mail = new MonitoringMail();
		String messageBody = "http://"+(InetAddress.getLocalHost().getHostAddress())+":8080/job/DataDrivenLiveProject/Extent_20Report/";
		System.out.println(messageBody);
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);

	}

}
