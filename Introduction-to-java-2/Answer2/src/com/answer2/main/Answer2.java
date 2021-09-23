package com.answer2.main;

import java.util.Scanner;

public class Answer2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String to be sorted");
		String str= sc.nextLine().toLowerCase();
		int jj=0;
		
		StringBuilder sb=new StringBuilder(str);		// Converting string to String Builder
		StringBuilder sorted=new StringBuilder();		// Making a new String Builder to store the sorted string
		
		char min='z';		// character with largest alphabatic variable to initiate check
		
		//Looping through the String
		for(int i=0; i<str.length(); i++)
		{
			for(int j=0; j<sb.length()-i; j++)
			{
				if(min>sb.charAt(j))   // If minimum is larger than current perform switch
				{
					min=sb.charAt(j);
					jj=j;
				}
			}
			
			// at end place the min in new sorted string buffer
			sorted.append(sb.charAt(jj));
			sb.deleteCharAt(jj);
			
			// reset the values
			jj=0; 
			min='z';
		}
		
		
		// Print the sorted string
		System.out.println(sorted.toString());
		
	}

}
