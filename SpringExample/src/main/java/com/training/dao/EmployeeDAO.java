package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.interfaces.IEmployee;
import com.training.mappers.EmployeeMapper;

public class EmployeeDAO implements IEmployee {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public Employee getEmployee(int empId) {
		
		String qry="select empid,empname,empsal from employee where empid=?";
		
		
//		Employee emp=jdbcTemplateObject.queryForObject(qry,new  Object[] {empId},
//				new BeanPropertyRowMapper<Employee>(Employee.class));
		
		
		Employee emp=jdbcTemplateObject.queryForObject(qry,new  Object[] {empId},
				new EmployeeMapper());
		return emp;
	}

	public List<Employee> getAllEmps() {
		List<Employee> employees=new ArrayList<Employee>();
		String qry="select empid,empname,empsal from employee";
		//List<Map<String,Object>> empRes=jdbcTemplateObject.queryForList(qry);
		
		
	//	for(Map row:empRes)
//		{
//			Employee emp=new Employee();
//			emp.setEmpId(Integer.parseInt(row.get("empid").toString()));
//			emp.setEmpName(row.get("empid").toString());
//			emp.setEmpSal(Double.parseDouble(row.get("empid").toString()));
//			employees.add(emp);
//		}
//		
		   employees=jdbcTemplateObject.queryForList(qry, Employee.class);
		   
		   return employees;
		   
		   
		   
		   
		 // employees= jdbcTemplateObject.queryForList(qry);
		   
	}

	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		
	}

	public void setDataSource(DataSource dataSource) {
     this .dataSource=dataSource;
     this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}

	public void insertEmployee(Employee emp) {
     
		String qry="insert into employee(empid,empname,empsal) values(?,?.?)";
		
		jdbcTemplateObject.update(qry,
				emp.getEmpId(),
				emp.getEmpName(),
				emp.getEmpSal());
		
		
		System.out.println("record created.....");
		
	}

}
