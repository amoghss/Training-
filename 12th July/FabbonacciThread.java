package com.wiley.adv;

import java.util.*;


public class FabbonacciThread {
	static FabThread fb;
	public static void main(String args[])
	{
		int n=6;
		fb=new FabThread();
		FabSum fs=new FabSum();
		
		Thread t1= new Thread(fb,"one");
		t1.start();
		t1.setPriority(10);
		
		Thread t2=new Thread(fs,"two");
		t2.start();
	
		
	}

}

class FabThread implements Runnable
{
	int one=1,two=1,sum=0,k=0;
	ArrayList<Integer> fab=new ArrayList<>();
	@Override
	public void run()
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			int temp=0;
			if(Thread.currentThread().getName().equals("one"))
			{
				if(fab.size()==0)
				{
					fab.add(1);
					fab.add(1);
//					temp=one;
//					one=two;
//					two=temp+two;
				}
				else
				{
					fab.add(one+two);
					temp=one;
					one=two;
					two=temp+two;
				}
			}
		
	}
		System.out.println(fab+"\n");
	}	
}
class FabSum implements Runnable
{
	//FabThread f=new FabThread();
	int sum=0;
	@Override
	public void run()
	{
		for(int i:FabbonacciThread.fb.fab)
		{
			System.out.println(sum+" + "+i+" = "+(sum+i));
			sum=sum+i;
		}
		//System.out.println(FabbonacciThread.fb.fab);
	}
}

