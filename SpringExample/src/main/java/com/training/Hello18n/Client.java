package com.training.Hello18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	
	//french class bean
	Greeting greeting=context.getBean("french",GreetFrench.class);
	
	
	System.out.println(greeting.greetHello());
	
	
	//English class bean
Greeting greeting1=context.getBean("english",GreetEnglish.class);
	
	
	System.out.println(greeting1.greetHello());
	}

}
