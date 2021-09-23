package com.answer5.main;


class ToBeCloned implements Cloneable
{
	int a;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
}

public class UsingCloneable{
	
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		ToBeCloned ob =new ToBeCloned(); 		// making a object using new
		
		ToBeCloned ob2= (ToBeCloned)ob.clone();  // Using clone to duplicate the object 
		
		// Upon printing we get different Hash for both Objects i.e both object have different reference at Heap
		System.out.println(ob);
		System.out.println(ob2);
		
	}

}
