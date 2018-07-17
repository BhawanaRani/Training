package com.training.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.HelloService;

public class Client {
public static void main(String[] args) {
	//ApplicationContext factory=new ClassPathXmlApplicationContext("spring-conf2.xml");
	
//	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-conf2.xml");
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-conf.xml","spring-conf2.xml");
	Employee emp=(Employee) context.getBean("employee");
	
	System.out.println(emp.hashCode());
	System.out.println("Emp id:"+emp.geteId());
	System.out.println("Emp Name:"+emp.geteName());
	System.out.println("Emp Sal:"+emp.geteSal());
	
	
	
	Employee emp1=(Employee) context.getBean("employee");
	
	System.out.println(emp1.hashCode());
	System.out.println("Emp id:"+emp1.geteId());
	System.out.println("Emp Name:"+emp1.geteName());
	System.out.println("Emp Sal:"+emp1.geteSal());
	
	HelloService service=(HelloService) context.getBean("defaultHello");
	System.out.println(service.sayHello());
	context.registerShutdownHook();
}
}
