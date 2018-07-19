package com.training.aop.model;

public class Account {
private int accNO;
private String accName;
private double balance;
public int getAccNO() {
	return accNO;
}
public void setAccNO(int accNO) {
	this.accNO = accNO;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accNO=" + accNO + ", accName=" + accName + ", balance=" + balance + "]";
}
public Account(int accNO, String accName, double balance) {
	super();
	this.accNO = accNO;
	this.accName = accName;
	this.balance = balance;
}


public Account() {
}
}
