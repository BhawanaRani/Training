package com.training.BPP;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.Employee.Employee;

//you want spring to know this is post processor
//implements BeanProcesor,this say every bean when create has to go through this class


//this class can handle any class/s
public class EmployeeBeanProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object emp, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		
		if(emp instanceof Employee)
		{
			Employee e=(Employee)emp;
            e.seteName(e.geteName().toUpperCase());
            return e;
		}
		return emp;
	}

	public Object postProcessBeforeInitialization(Object emp, String arg1) throws BeansException {
	System.out.println("postProcessBeforeInitialization");
		return emp;
	}

}
