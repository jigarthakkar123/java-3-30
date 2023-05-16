package com.exception;

import java.util.concurrent.atomic.DoubleAccumulator;

public class CheckingAccount {

	int acno;
	String cname;
	double balance;
	public CheckingAccount(int acno, String cname, double balance) {
		this.acno = acno;
		this.cname = cname;
		this.balance = balance;
		System.out.println("Hello "+this.cname+", Your Account Number "+this.acno+" Is Opened With "+this.balance+" Rs.");
	}
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	void withdraw(double amount) throws InSufficientFund
	{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSufficientFund(needs);
		}
	}
	void checkBalance()
	{
		System.out.println("Current Balance : "+this.balance);
	}
	
}
