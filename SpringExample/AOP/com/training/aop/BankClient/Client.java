package com.training.aop.BankClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.service.BankingService;

public class Client {
public static void main(String[] args) {
	
	
ApplicationContext context=new ClassPathXmlApplicationContext("aop-context.xml");

BankingService service=(BankingService) context.getBean("banking");


System.out.println("CAAcount details:"+service.getcAaccount().getAccount().getBalance());

System.out.println("SBAccount Details:"+service.getsBaccount().getAcc().getBalance());

service.getcAaccount().getOneParameter(100);

service.setAndGet("Harry");
service.throwException();
}
}
