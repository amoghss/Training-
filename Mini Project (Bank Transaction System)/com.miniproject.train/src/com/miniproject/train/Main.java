package com.miniproject.train;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Customers
{
	int customerId;
	String customerName;
	
	public Customers(int customerId, String customerName) {
		// TODO Auto-generated constructor stub
		this.customerId=customerId;
		this.customerName=customerName;
	}
}

class Accounts
{
	int accountId;
	int pin;
	double balance;
	String accountType,bank;
	Customers customer;
	double loan;
	
	public Accounts(int accountId, double balance, String accountType, Customers customer, String bank, double loan,int pin) {
		// TODO Auto-generated constructor stub
		this.accountId=accountId;
		this.balance=balance;
		this.bank=bank;
		this.accountType=accountType;
		this.customer=customer;
		this.loan=loan;
		this.pin=pin;
	}
	@Override
	public String toString()
	{
		return String.valueOf(this.accountId);
	}
}

class Transaction
{
	String from;
	double amount;
	String status;
	Accounts a;
	
	public Transaction(String from, double amount, String status, Accounts a) {
		// TODO Auto-generated constructor stub
		this.from=from;
		this.amount=amount;
		this.status=status;
		this.a=a;
	}
	
	public String toString()
	{
		return "Transation from: "+this.from+"\nAmount: "+this.amount+"\nStatus: "+this.status+"\nAccountId: "+this.a.accountId+"\nBalance: "+this.a.balance+"\n";
	}
}

public class Main {
	
	public static void main(String args[])
	{
		List<Customers> cust=new ArrayList<>();
		List<Accounts> acc=new ArrayList<>();
		List<Transaction> tran=new ArrayList<>();
		
		cust.add(new Customers(1, "cus1"));
		cust.add(new Customers(2, "cus2"));
		cust.add(new Customers(3, "cus3"));
		
		acc.add(new Accounts(1, 1000, "Savings", cust.get(0), "ICICI", 0, 123));
		acc.add(new Accounts(2, 2000, "Savings", cust.get(1), "AXIS", 0, 123));
		acc.add(new Accounts(3, 100, "Savings", cust.get(2), "SBI", 0, 123));
		
		int accountNo= 2;
		List<Accounts> a=acc.stream().filter(u-> u.accountId==accountNo).collect(Collectors.toList());
		int pass= 123;
		//System.out.println(a);
		
		if(a.size()==0)
		{
			System.out.println("No Such Account Found");
		}
		else if(a.get(0).pin!=pass)
		{
			System.out.println("Invalid Pin");
		}
		else
		{
			int type = 0;         // 0 means debit 1 means cridit
			
			double amount= 500;   //enter the amout.
			
			if(type==0)
			{
				if(amount<=a.get(0).balance)
				{
					tran.add(new Transaction("Debit", amount, "Transaction Complete", a.get(0)));
					a.get(0).balance-=amount;
				}
				else
				{
					tran.add(new Transaction("Debit", amount, "Transaction Not Complete", a.get(0)));
					System.out.println("Not Sufficient Balance");
				}
			}
			else
			{
				tran.add(new Transaction("Debit", amount, "Transaction Complete", a.get(0)));
				a.get(0).loan+=amount;
			}
		}
		for(Transaction t:tran)
		{
		System.out.println(t);
		}
		}

}