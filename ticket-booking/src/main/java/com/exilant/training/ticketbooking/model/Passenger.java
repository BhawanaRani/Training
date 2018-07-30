package com.exilant.training.ticketbooking.model;

public class Passenger {
private long ticketNumber;
private String passClass;
private String name;
private String sex;
private  String mobile;
//private int noOfSeats;
//private Flight flight;

public String getPassClass() {
	return passClass;
}
public void setPassClass(String passClass) {
	this.passClass = passClass;
}

public long getTicketNumber() {
	return ticketNumber;
}
public void setTicketNumber(long ticketNumber) {
	this.ticketNumber = ticketNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Passenger [name=" + name + ", sex=" + sex + ", mobile=" + mobile + "]";
}
public Passenger(String name, String sex, String mobile) {
	super();
	this.name = name;
	this.sex = sex;
	this.mobile = mobile;
}



public Passenger() {
}
}
