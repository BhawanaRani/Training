package com.training.messageResource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HelloWorld {
private String greeting;
private String message;



//have messageResource entry make in .xml file and u can do auto wire ...do below
@Autowired
private MessageSource messageSource;

public String getGreeting() {
	return greeting;
}

public void setGreeting(String greeting) {
	this.greeting = greeting;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public MessageSource getMessageSource() {
	return messageSource;
}

public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
}

public void sayHelloWorld_fr()
{
	System.out.println(messageSource.getMessage("helloWorld.greet",new Object[] {greeting,message},new Locale("_fr")));
}



public void sayHelloWorld()
{
	System.out.println(messageSource.getMessage("helloWorld.greet",new Object[] {greeting,message},null));
}


}
