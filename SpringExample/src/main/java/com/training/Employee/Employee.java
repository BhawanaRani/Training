package com.training.Employee;

public class Employee {
private int eId;
private String eName;
private double eSal;
protected int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public double geteSal() {
	return eSal;
}
public void seteSal(double eSal) {
	this.eSal = eSal;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + "]";
}
public Employee(int eId, String eName, double eSal) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.eSal = eSal;
}

public void init()
{
	System.out.println("init for Employee");
}


public void ginit()
{
	System.out.println("Global init for Employee");
}

public void destroy()
{
	System.out.println("destroy for Employee");
}

public void gdestroy()
{
	System.out.println("Global destroy for Employee");
}
public Employee() {
	System.out.println("default constructor invoked.......");
}

}
