package com.answer4.main;

public class SingoltonClass {
	
	private static SingoltonClass obj=null;
	
	private SingoltonClass()  
	{
		 // making the constructor as private to avoid object creation of class from outside
	}
	
	public static SingoltonClass getObject()
	{
		if(obj==null)
		{
			obj= new SingoltonClass();    		//if object is not created we create the object and store in obj
		}
		
		return obj; 							// anytime we call object we get same object stored in obj.
	}

}
