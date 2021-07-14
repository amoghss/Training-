package com.wiley.adv;
import java.util.*;

public class SyncFibo {
	static List<Integer> lis=new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		lis.add(1);
		one o=new one(lis);
		two t=new two(lis);
		Thread t1=new Thread(o,"Printer");
		Thread t2=new Thread(t,"Adder");
		t1.start();
		t2.start();
		
		
	}
}
class two implements Runnable
{
	List<Integer> lis;
	int a=0;
	int b=1;
	
	public two(List<Integer> lis)
	{
		this.lis=lis;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			synchronized (lis) {
				
			while(lis.size()==1)
			{
				try {
					lis.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			int temp = a + b;
			a = b;
			b = temp;
			lis.add(temp);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(Thread.currentThread().getName());
			lis.notify();
			}
		}
		
	}
}
class one implements Runnable
{
	List<Integer> lis;
	int s=0;
	public one(List<Integer> lis) {
		// TODO Auto-generated constructor stub
		this.lis=lis;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			synchronized (lis) {
				while(lis.size()==0)
				{
					try {
						lis.wait();
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				int temp=lis.remove(0);
				//System.out.println(Thread.currentThread().getName());
				System.out.println(s+" + "+temp+" = "+(s+temp));
				s=s+temp;
				lis.notify();
				
			}
		}
		
		
	}
}
