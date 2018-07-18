package com.training.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("collection-context.xml");
	
	
	MyCollection myCollection=(MyCollection) context.getBean("myCollection");
	
	System.out.println(myCollection.getQuestionBank());
	System.out.println(myCollection.getAccountMap());
	System.out.println(myCollection.getAddressSet());
}
}
