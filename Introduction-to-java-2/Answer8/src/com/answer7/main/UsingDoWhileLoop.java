package com.answer7.main;

import java.util.Scanner;

public class UsingDoWhileLoop {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the world and press enter,\n Enter done to exit");
		
		StringBuilder sb=new StringBuilder(sc.nextLine());
		
		do   // Infinite do while loop
		{
			if(sb.toString().equals("done")) 	// If input string == done then Exit else keep iterating
			{
				break;
			}
			
			if(sb.charAt(0)==(sb.charAt(sb.length()-1)))	// Message for equality
			{
				System.out.println("First char = Last Char\n");
			}
			else	// Message for non-equality
			{
				System.out.println("First char != Last Char\n");
			}
			
			sb=new StringBuilder(sc.nextLine()); // Accept a input string for next iteration
		
		}while(true);
		
		System.out.println("Exit done");
	}

}
