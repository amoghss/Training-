package com.answer13.main;

class MyCustomException extends Exception  
{  
    //private boolean suppressStacktrace=false;

	public MyCustomException() {
    	
        super("custom exception", null);
        //this.suppressStacktrace = true;
    	
	}

	@Override
	public String toString() {
		
		return super.getMessage();
	}
	
	
}  
    
// class that uses custom exception MyCustomException  
public class CustomError 
{  
    // main method  
    public static void main(String args[])  
    {  
    	try {
    	    throw new MyCustomException();
    	} catch (MyCustomException e) {
    	    System.out.println(e.getMessage());
    	}

    }  
}  