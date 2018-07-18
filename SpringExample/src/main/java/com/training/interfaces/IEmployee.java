package com.training.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.training.entity.Employee;

public interface IEmployee {
public Employee getEmployee(int empId);

public List<Employee> getAllEmps();

public void insertEmployee(Employee emp);

public void deleteEmployee(int empId);

public void updateEmployee(int empId,double empNewSalary);

public void setDataSource(DataSource dataSource);
}
