package com.training.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		
		
		//ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplicationContext context=new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Development");
		
		((AnnotationConfigApplicationContext)context).scan("com.training.profile");//loading the profiles
		
		((AnnotationConfigApplicationContext)context).refresh();
		
		((AnnotationConfigApplicationContext)context).close();
		
		
		
	}

}
