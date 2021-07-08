package com.wiley.adv;

import java.util.*;

class User
{
	int id;
	String name;
	
	User(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}
}

public class Task {
	
	public static void main(String args[])
	{
		Set<Object> hash=new TreeSet<>(new sorter());
		
		hash.add(Integer.valueOf("44"));
		hash.add(Integer.valueOf("66"));
		hash.add(Integer.valueOf("11"));
		
		hash.add(new User(99,"U1"));
		hash.add(new User(1,"U2"));
		hash.add(new User(65,"U3"));	
		
		hash.add(new String("one"));
		hash.add(new String("two"));
		hash.add(new String("three"));
		
		System.out.println(hash);
		
	}
	

}
class sorter implements Comparator<Object>
{
	@Override
	public int compare(Object ob1,Object ob2)
	{
//		int flag=0;
		if(ob1 instanceof User && ob2 instanceof User)
		{
			int u1=(int)((User)ob1).id;
			int u2=(int)((User)ob2).id;
//			flag=1;
			return comp(u1,u2);
		}
		else if(ob1 instanceof Integer && ob2 instanceof Integer)
		{
			Integer u1=(Integer)ob1;
			Integer u2=(Integer)ob2;
//			flag=1;
			return comp(u1,u2);
		}
		else if((ob1 instanceof String && ob2 instanceof String))
		{
			String u1=(String)ob1;
			String u2=(String)ob2;
//			flag=1;
			return compStr(u1,u2);
		}		
		
		return -1;
		
	}
	int comp(int u1,int u2)
	{
		if(u1>u2)
			return 1;
		else
			return -1;
		
	}
	int compStr(String u1,String u2)
	{
		
		if(u1.compareTo(u2)==1)
			return 1;
		else
			return -1;
	}
}
