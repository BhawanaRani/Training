package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.interfaces.IEmployee;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("db-context.xml");
		
		
		IEmployee employeeDao=(IEmployee) context.getBean("employeeDaoTemplate");
		
		
//		Employee emp1=new Employee(101,"Bhawana",34000);
//		Employee emp2=new Employee(102,"Ramma",45000);
//		Employee emp3=new Employee(103,"Tejashvini",56000);
//		Employee emp4=new Employee(104,"Tanmayee",60000);
//		
//		employeeDao.insertEmployee(emp1);
//		employeeDao.insertEmployee(emp2);
//		employeeDao.insertEmployee(emp3);
//		employeeDao.insertEmployee(emp4);
		
		
		
		Employee rmp=employeeDao.getEmployee(101);
		System.out.println(rmp);
	}

}
