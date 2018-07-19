package com.training.aop.service;

import javax.management.RuntimeErrorException;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SBAccount;

public class BankingService {
private SBAccount  sBaccount;
private CAAccount cAaccount;
public SBAccount getsBaccount() {
	return sBaccount;
}
public void setsBaccount(SBAccount sBaccount) {
	this.sBaccount = sBaccount;
}
public CAAccount getcAaccount() {
	return cAaccount;
}
public void setcAaccount(CAAccount cAaccount) {
	this.cAaccount = cAaccount;
}
@Override
public String toString() {
	return "BankingService [sBaccount=" + sBaccount + ", cAaccount=" + cAaccount + "]";
}

public String setAndGet(String name)
{
	return "Hello "+name;
}


public void throwException()

{
	int a=1;
	if(a==1)
	{
		throw new RuntimeErrorException(null, "user throw exception");
	}
	System.out.println("user is okay without exception");
	//return null;
	}


}

