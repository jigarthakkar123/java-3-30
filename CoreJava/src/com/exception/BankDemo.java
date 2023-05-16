package com.exception;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		double amount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("***************************************************");
		System.out.print("Enter Account Number : ");
		int acno=scanner.nextInt();
		System.out.println("***************************************************");
		System.out.print("Enter Customer Name : ");
		String cname=scanner.next();
		System.out.println("***************************************************");
		System.out.print("Enter Initial Balance : ");
		double balance=scanner.nextDouble();
		System.out.println("***************************************************");
		CheckingAccount c=new CheckingAccount(acno,cname,balance);
		while(true) {
			System.out.println("***************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Witdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("***************************************************");
			System.out.print("Enter Your Choice : ");
			int choice=scanner.nextInt();
			System.out.println("***************************************************");
			
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount : ");
				amount=scanner.nextDouble();
				c.deposit(amount);
				System.out.println("***************************************************");
			}
			else if(choice==2)
			{
				try {
					System.out.print("Enter Withdrawal Amount : ");
					amount=scanner.nextDouble();
					c.withdraw(amount);
				} catch (InSufficientFund e) {
					System.out.println("Sorry You Need Another "+e.getAmount());
				}
				System.out.println("***************************************************");
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("***************************************************");
			}
			else 
			{
				System.out.println("Good Bye. Thank You Using Our Services");
				System.out.println("***************************************************");
				break;
			}
		}
	}
}
