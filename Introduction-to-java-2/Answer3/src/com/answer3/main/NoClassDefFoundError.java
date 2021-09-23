package com.answer3.main;

class Parent   
{   
    void show()   
    {   
        System.out.println( "Hello i am Parent class" );   
    }   
}   

/* Here the child class was compiled but was commented out before Running the program so we got
 * NoClassDefFoundError at runtime */

//class Child extends Parent 
//{   
//    void showData()   
//    {   
//        System.out.println( "Hello i am child, I was compiled but i was commented before running" );   
//    }   
//}

public class NoClassDefFoundError{
    public static void main(String args[])    
    {   
        Child obj = new Child();   // Child class was compiled but removed before running
        obj.showData();  
        obj.show();          
    }   
}  
