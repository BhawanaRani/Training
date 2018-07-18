package com.training.messageResource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new
			ClassPathXmlApplicationContext("messageResource-context.xml");
	
	String engGoodMorning=context.getMessage("goodmorning",new Object[] {},null);
	String frenchGoodMorning=context.getMessage("goodmorning",new Object[] {},new Locale("fr"));
	
	
	
	System.out.println(engGoodMorning);
	System.out.println(frenchGoodMorning);
	
	
	
	
	System.out.println("-----------------------------------------------");
	
	
	HelloWorld helloWorld=context.getBean("helloWorld",HelloWorld.class);
	
	
	helloWorld.sayHelloWorld();
	helloWorld.sayHelloWorld_fr();

	}

}
