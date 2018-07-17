package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.conf3.xml","camera.xml","screen.xml","speaker.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.conf3.xml");
		
		
		Mobile mobile=(Mobile)context.getBean("mobile",Mobile.class);
		
		System.out.println("Mobile Type:"+mobile.getCamera().getType());
		System.out.println("Screen Details:"+mobile.getScreen().getGlassType()+" length:"+mobile.getScreen().getLen()+" bredth:"+mobile.getScreen().getBre());
	
	
	   System.out.println("Speaker Details:"+mobile.getSpeaker().getType()+" volume:"+mobile.getSpeaker().getVolume());
	}

}
