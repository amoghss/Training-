package com.answer3.main;


class Shape  
{   
    void show()   
    {   
        System.out.println( "I am a shape class" );   
    }   
}   

/* No Class Triangle ever existed in the program, So when in main it was called we got
 * ClassNotFoundException at runtime.
 */

public class ClassNotFoundException {
    public static void main(String args[])    
    {   
        Triangle obj = new Triangle();   // Triangle does not exist so we get ClassNotFound
        obj.show();
    }   
}  



	

