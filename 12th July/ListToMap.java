package com.wiley.adv;

import java.util.ArrayList;
import java.util.HashMap;

// Converts the Map to a list using Threads
class People
{
	int id;
	String name;
	Projects projects;
	
	public People(int id, String name, Projects projects) {
		this.id = id;
		this.name = name;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", projectId=" + projects.pid;
	}
	
	
}

class Projects
{
	int pid;
	String pname;
	
	public Projects(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname;
	}
	
	
	
}
public class ListToMap {
	
	static ArrayList<People> people=new ArrayList<>();
	

	
	public static void main(String args[])
	{
		Projects p1=new Projects(1, "Google");
		Projects p2=new Projects(2, "FB");
		
		people.add(new People(1,"one",p1));
		people.add(new People(2,"two",p2));
		people.add(new People(3,"three",p1));
		
		MapperThread mt=new MapperThread();
		Thread t1=new Thread(mt);
		t1.start();

	}
	
}

class MapperThread implements Runnable
{
	HashMap<People,Projects> h=new HashMap<>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(People p:ListToMap.people)
		{
			h.put(p, p.projects);
		}
		for(People p:h.keySet())
		{
		System.out.println(p+"\t"+h.get(p));
	}}
}
