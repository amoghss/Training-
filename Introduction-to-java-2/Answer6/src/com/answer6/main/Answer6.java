package com.answer6.main;

public class Answer6 {
	
	public static void main(String args[])
	{
		try         									// try block
		{
			int[] arr= new int[2];
			System.out.println(arr[4]);   				// This will raise ArrayIndexOutOfBound Exception
			arr[1]=4/0;									// ArithmaticException will raise
		}
		
		catch(ArithmeticException e)					// Catch the ArithmaticExeption
		{
			System.out.println("divided by 0");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {		// ArrayIndexOutOfBoundsException
			// TODO: handle exception
			System.out.println("Array range out of box");
		}
		
		catch (Exception e) {							// Catches other exception
			// TODO: handle exception
			System.out.println("Any other Exception came");
		}
		
		finally {										// This block will always execute.
			System.out.println("Reached Finally Block");
		}
	}

}
