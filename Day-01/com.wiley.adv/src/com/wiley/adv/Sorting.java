package com.wiley.adv;
import java.util.*;

class Employee
{
	int salary;
	String name;
	
	Employee(int salary, String name)
	{
		this.salary=salary;
		this.name=name;
	}
	
}

class sort implements Comparator<Employee>
{
	@Override
	public int compare(Employee ob1, Employee ob2)
	{
		if((ob1.salary >ob2.salary))
		{
			return 1;    //Swap
		}
		else if((ob1.salary <ob2.salary))
		{
			return -1;   // No swap
		}
		return ob1.name.compareTo(ob2.name);
	}
}


public class Sorting 
{
	
	
	public static void main(String[] args)
	{
		List<Employee> l=new ArrayList<Employee>();
		
		l.add(new Employee(1000,"E1"));
		l.add(new Employee(1200,"E2"));
		l.add(new Employee(1000, "E3"));
		
		sort s=new sort();
		
		Collections.sort(l,s);
		
		System.out.println(l.get(0).name);
		System.out.println(l.get(1).name);
		System.out.println(l.get(2).name);
		
	}
	
}
