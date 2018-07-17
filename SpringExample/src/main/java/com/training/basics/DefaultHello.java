package com.training.basics;

public class DefaultHello implements HelloService {
 @Override
	public String toString() {
		return "DefaultHello [name=" + name + ", city=" + city + "]";
	}

private String name;
 private String city;
	
	public DefaultHello() {
		
	}
	
	public DefaultHello(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}

	public String getName() {
	return name;
}

	public void setName(String name) {
	this.name = name;
}

	public String getCity() {
	return city;
}

	public void setCity(String city) {
	this.city = city;
}



	public String sayHello() {
		return sayHello(name,city);
	}

	public String sayHello(String name, String city) {
		String strs[]= {
				"hey how are you Mr./Ms/Mrs %s  & how is your city %s",
				"Good Morning %s,are you in %s",
				"Mr/Mrs/Ms %s ,Your city is beatiful %s"
		};
		
		int randomNumber =(int) Math.random()*3;
		return String.format(strs[randomNumber],name,city);
	}
	
	public void ginit()
	{
    System.out.println("global init in defaultHello");		
	}
	
	public void gdestroy()
	{
    System.out.println("global destroy in defaultHello");		
	}
}
