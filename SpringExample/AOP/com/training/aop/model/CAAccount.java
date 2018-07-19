package com.training.aop.model;

public class CAAccount {
private Account account;

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public double showBalance()
{
	return account.getBalance();
}


public void getTest()
{
	System.out.println("this is default test.........");
}

public void getOneParameter(int x)
{
	System.out.println("x:"+x);
}
}
