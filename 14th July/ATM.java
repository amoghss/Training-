package com.wiley.adv;

import java.util.*;
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
	int five,ten,fifty,hundred;
	
	public Transaction(String from, double amount, String status, Accounts a, int five, int ten, int fifty, int hundred) {
		// TODO Auto-generated constructor stub
		this.from=from;
		this.amount=amount;
		this.status=status;
		this.a=a;
		this.five = five;
		this.ten = ten;
		this.fifty = fifty;
		this.hundred = hundred;
	}
	
	public String toString()
	{
		return "Transation from: "+this.from+"\nAmount: "+this.amount+"\nStatus: "
	+this.status+"\nAccountId: "+this.a.accountId+"\nBalance: "+this.a.balance+"\n"+"100 :"+hundred+"\t50 :"+fifty+"\t10 :"+ten+"\t5 :"+five;
	}
}

class currency
{
	int five, ten, twenty, fifty, hundred, twoHundered, fiveHundered, twoThousand;

	public currency(int five, int ten, int twenty, int fifty, int hundred, int twoHundered, int fiveHundered,
			int twoThousand) {
		super();
		this.five = five;
		this.ten = ten;
		this.twenty = twenty;
		this.fifty = fifty;
		this.hundred = hundred;
		this.twoHundered = twoHundered;
		this.fiveHundered = fiveHundered;
		this.twoThousand = twoThousand;
	}

	
	
}

public class ATM {
	
	public static void main(String[] args)
	{
		int d;
		int fifty=0,ten=0,hun=0,five=0;
		int hun2=0,fifty2=0,ten2=0,five2=0;
		Scanner sc=new Scanner(System.in);
		
		int aa=10;          //five
		int bb=10;          //ten
		int cc=10;          //fifty
		int dd=2;          //Hundred
		currency curr=new currency(aa, bb, 0, cc, dd, 0, 0, 0);
		
		List<Customers> cust=new ArrayList<>();
		List<Accounts> acc=new ArrayList<>();
		List<Transaction> tran=new ArrayList<>();
		
		cust.add(new Customers(1, "cus1"));
		cust.add(new Customers(2, "cus2"));
		cust.add(new Customers(3, "cus3"));
		
		acc.add(new Accounts(1, 1000, "Savings", cust.get(0), "ICICI", 0, 123));
		acc.add(new Accounts(2, 2000, "Savings", cust.get(1), "AXIS", 0, 123));
		acc.add(new Accounts(3, 100, "Savings", cust.get(2), "SBI", 0, 123));
		
		//int accountNo= 2;
		System.out.println("Enter the Account Number");
		int accountNo=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Account pin");
		int pass=Integer.parseInt(sc.nextLine());
		//int pass= 123;
		
		List<Accounts> a=acc.stream().filter(u-> u.accountId==accountNo).collect(Collectors.toList());
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
			System.out.println("Transaction Amount");
			int amount=Integer.parseInt(sc.nextLine());
			int amount2=amount;
			if(amount<=a.get(0).balance)
			{
				if((int)amount/100 >0 && amount!=0)
				{
					if(((int)amount/100)<=((int)(75*(curr.hundred))/100))
					{
						curr.hundred-=((int)amount/100);
						hun+=(((int)amount/100));
					}
					else
					{
						curr.hundred-=(int)(75*(curr.hundred)/100);
						hun+=(int)(75*(curr.hundred)/100);
					}
				}
				amount-=hun*100;
				if((int)amount/50 >0 && amount!=0)
				{
					if(((int)amount/50)<=((int)(75*(curr.fifty))/100))
					{
						curr.fifty-=((int)amount/50);
						fifty+=(((int)amount/50));
						//System.out.println(fifty);
						//System.out.println("AMTTTTTT"+(int)amount/50);
					}
					else
					{
						curr.fifty-=(int)(75*(curr.fifty)/100);
						fifty+=((int)(75*(curr.fifty))/100);
						//System.out.println("AMTTTTTT"+(int)amount/50);
						//System.out.println(fifty);
					}
				}
				amount-=fifty*50;
				if((int)amount/10 >0 && amount!=0)
				{
					if(((int)amount/10)<=((int)(75*(curr.ten))/100))
					{
						curr.ten-=((int)amount/10);
						ten+=(((int)amount/10));
					}
					else
					{
						curr.ten-=(int)(75*(curr.ten)/100);
						ten+=((int)(75*(curr.ten))/100);
					}
				}
				amount-=ten*10;
				if((int)amount/5 >0 && amount!=0)
				{
					if(((int)amount/5)<=((int)(75*(curr.five))/100))
					{
						curr.five-=((int)amount/5);
						five+=(((int)amount/5));
					}
					else
					{
						curr.five-=(int)(75*(curr.ten)/100);
						five+=((int)(75*(curr.ten))/100);
					}
				}
				amount-=five*5;
				
				if(amount==0)
				{
					tran.add(new Transaction("Debit", amount2, "Transaction Complete", a.get(0), five, ten, fifty, hun));
					a.get(0).balance-=amount2;
					five=0;
					ten=0;
					fifty=0;
					hun=0;
				}
				else
				{
					
					if(amount%5==0)
					{
						d=(int)amount/5;
						while(amount>0 && d>0)
						{
							if((int)amount/100 >0 && curr.hundred!=0)
							{
									curr.hundred-=((int)amount/100);
									hun2+=(((int)amount/100));
							}
						
							
							amount-=hun2*100;
							if((int)amount/50 >0 && curr.fifty!=0)
							{
								
									curr.fifty-=((int)amount/50);
									fifty2+=(((int)amount/50));
								
								
							}
							amount-=fifty2*50;
							if((int)amount/10 >0 && curr.ten!=0)
							{
								
									curr.ten-=((int)amount/10);
									ten2+=(((int)amount/10));
								
									curr.ten-=(int)(75*(curr.ten)/100);
									ten2+=((int)(75*(curr.ten))/100);
							}
							amount-=ten2*10;
							if((int)amount/5 >0 && curr.five!=0)
							{
								
									curr.five-=((int)amount/5);
									five2+=(((int)amount/5));
								
							}
							amount-=five2*5;
							d--;
						}
						tran.add(new Transaction("Debit", amount2, "Transaction Complete", a.get(0), (five+five2), (ten+ten2), (fifty+fifty2), (hun+hun2)));
						a.get(0).balance-=amount2;
						five=0;
						ten=0;
						fifty=0;
						hun=0;
					}
					else
					{
						System.out.println("TRY DIFFERENT AMOUNT");
						tran.add(new Transaction("Debit", amount2, "Transaction Not Complete", a.get(0), 0,0,0,0));
						five=0;
						ten=0;
						fifty=0;
						hun=0;
					}
				}
				}
			else
			{
				tran.add(new Transaction("Debit", amount2, "Transaction Not Complete", a.get(0), 0,0,0,0));
				System.out.println("Not Sufficient Balance");
			}
			
		}
		for(Transaction t:tran)
		{
		System.out.println(t);
		}
		sc.close();
		}
	}

