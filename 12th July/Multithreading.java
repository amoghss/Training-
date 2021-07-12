package com.wiley.adv;

import java.util.ArrayList;
import java.util.List;

public class Multithreading{
	
	
	
	public static void main(String[] args) {
		
		MyThread1 m1 = new MyThread1();
		
		for(int i=0;i<=100;i++)
		{
			Thread t1 = new Thread(m1,"T1");
			Thread t2 = new Thread(m1,"T2");
			t1.start();
			t2.start();
		}
		try
		{
			Thread.sleep(50);
			System.out.println(m1.list);           //Prints the list with all unique value.
		}
		
		catch (Exception e) 
		{
			System.out.print(e);
		}
		
		
	}

}
class MyThread1 implements Runnable{
	
	List<Integer> list = new ArrayList<>();
	int i=0;
	@Override
	public void run() 
	{
		list.add(i++);   //Adds unique value to list from 2 threads
		
//		int c=i;
//		System.out.println(Thread.currentThread().getName()+" "+c);
		
		  
		
			
	}
		
	}
	

