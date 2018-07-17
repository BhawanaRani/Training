package com.training.basics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
	//	XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-conf.xml"));
		
	//	HelloService helloService=(HelloService)beanFactory.getBean("defaultHello");
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring-conf.xml");
		
		HelloService service=(HelloService) factory.getBean("defaultHello");
		System.out.println(service.sayHello());
		

	}

}
