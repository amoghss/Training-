package com.answer7.main;

import java.util.Scanner;

public class Answer7 {
	
	public void CalculateDays(int n)
    {
        int day = n / (24 * 3600); 	// Get the max possible multiple of no. of second in day i.e np. of days
        n = n % (24 * 3600);       	// get the remaining unallocated seconds
        
        int hour = n / 3600;		// Get the max possible multiple of no. of second in hour i.e np. of hours	   
        n %= 3600;					// get the remaining unallocated seconds
        
        int minutes = n / 60 ;		// Get the max possible multiple of no. of second in min i.e np. of mins
        n %= 60;					// get the remaining unallocated seconds
        	
        int seconds = n;			// remaining seconds
         
        System.out.println( day + " " + "day(s) " + hour
                           + " " + "hour(s) " + minutes + " "
                           + "minute(s) " + seconds + " "
                           + "second(s) ");
    }
	
	public static void main(String args[])
	{
		// Given n is in seconds
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of seconds");
		int n=sc.nextInt();
		
		Answer7 obj=new Answer7();
		
		obj.CalculateDays(n);

	}

}
