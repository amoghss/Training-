import java.util.*;
import java.util.Comparator;
import java.util.List;

class Users
{
	String id;
	String name;
	Users(String id, String name){
		this.id = id;
		this.name = name;
}
}
	
class Employees extends Users{
	Address address;
	Projectes project;
	double salary;
	Employees(String id, String name, Addresses addresses, Projectes p1, double salary){
		super(id, name);
		this.address = address;
		this.project = p1;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return super.name;
	}
}

class Addresses{
	String city;
	String zipCode;
	Addresses(String city, String zipCode){
		this.city = city;
		this.zipCode = zipCode;
	}
}

class Projectes{
	int projectId;
	String name;
	double budget;
	Projectes(int projectId,String name,double budget){
		this.projectId = projectId;
		this.name = name;
		this.budget = budget;
	}
	
	boolean equals(Project p) {
		return this.projectId == p.projectId;
	}
}

class Sorter implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		
		if(o1.salary < o2.salary)
			return 1;
		else if(o1.salary >o2.salary)
			return -1;
		else
			return 0;
	}
	
}
public class Assignment {
	
	public static void main(String args[])
	{
		Projectes p1=new Projectes(1, "Google", 1000.0);
		Projectes p2=new Projectes(2, "Facebook", 1200.0);
		
		List<Users> li=new ArrayList<Users>();
		List<Employees> emp=new ArrayList<Employees>();
		HashMap<String,String> mapping =new HashMap<>();
		
		li.add(new Users("01", "U1"));
		li.add(new Employees("01", "E1", new Addresses("Ind", "xyz"), p1, 500));
		li.add(new Users("02", "U2"));
		li.add(new Employees("02", "E2", new Addresses("Ind", "xyz"), p1, 400));
		li.add(new Users("03", "U3"));
		li.add(new Employees("03", "E3", new Addresses("Ind", "xyz"), p1, 300));
		li.add(new Users("04", "U4"));
		li.add(new Employees("04", "E4", new Addresses("Ind", "xyz"), p2, 500));
		li.add(new Users("05", "U5"));
		li.add(new Employees("05", "E5", new Addresses("Ind", "xyz"), p2, 400));
		li.add(new Users("06", "U6"));
		li.add(new Employees("06", "E6", new Addresses("Ind", "xyz"), p2, 500));
		
		for(Users u:li)
		{
			if(u instanceof Employees)
			{
				emp.add((Employees) u);
			}
		}
		
		Collections.sort(emp, new Sorter());
		
		System.out.println(emp);
		
		for(Employees e: emp)
		{
			Projectes p=e.project;
			//System.out.println(e.id);
			
			if(p.budget>=e.salary)
			{
				mapping.put(e.id,p.name);
				p.budget-=e.salary;
			}
			
		}
		
		System.out.println(mapping);
		
		
	}


}
