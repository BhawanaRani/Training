package com.exilant.training.ticketbooking.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
	
	private String name;
	private String from;
	private String to;
	private Date departDate;
	private Date returnDate;
	
   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
	@Override
	public String toString() {
		return "Flight [name=" + name + ", from=" + from + ", to=" + to + ", departDate=" + departDate + ", returnDate="
				+ returnDate  + "]";
	}
	public Flight(String name, String from, String to, Date departDate, Date returnDate, String passClass
			) {
		this.name = name;
		this.from = from;
		this.to = to;
		this.departDate = departDate;
		this.returnDate = returnDate;
	//	this.passengers=new ArrayList<>();
		
	}
    
    public Flight() {
    	//this.passengers=new ArrayList<>();
   
    }  
    
    

}
