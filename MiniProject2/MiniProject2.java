package com.wiley.adv;

import java.util.*;

class users
{
	int id;
	String name;
	List<Address> address;
	
	public users(int id, String name, List<Address> address) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
	}

	
	
}
class Address
{
	int zip;
	String city;
	
	public Address(String city, int zip) {
		// TODO Auto-generated constructor stub
		this.zip=zip;
		this.city=city;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, zip);
	}
	
	public String toString()
	{
		return String.valueOf(zip)+city;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(String.valueOf(zip)+city, String.valueOf(other.zip)+other.city);
	}
	
}
class newUser
{
	int id;
	String name;
	
	public newUser(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return  "id=" + id + " name=" + name;
	}
}
public class MiniProject2 {
	public static void main(String[] args)
	{
		ArrayList<users> ar=new ArrayList<>();
		
		List<Address> ad1=Arrays.asList(new Address("BLR",560001), new Address("BLR",560002), new Address("DEL", 110001));
		List<Address> ad2=Arrays.asList(new Address("BLR",560038), new Address("DEL",110096), new Address("DEL", 110001));
		List<Address> ad3=Arrays.asList(new Address("BOM",4000018), new Address("BOM",400037), new Address("DEL", 110001),new Address("BLR",560001));
		ar.add(new users(3,"User3",ad1 ));
		ar.add(new users(44,"User44",ad2));
		ar.add(new users(2,"User2",ad3));
		
		HashMap<Address, List<newUser>> table=new HashMap<Address, List<newUser>>();
		
		//ar.stream().forEach(u-> u.address.stream().
		//		forEach(x-> table.get(x).add(new newUser(u.id,u.name))));
		
		//System.out.println(table.get(2));
		//table.get("110001DEL");
		for(users a:ar)
		{
			for(Address b:a.address)
			{
				//System.out.println(b);
				if(table.containsKey(b)) 
				{
					table.get(b).add(new newUser(a.id,a.name));
				
					//System.out.println("Invodked");
				}
				else
				{
					//System.out.println(table.containsKey("110001DEL"));
					List<newUser> l = new ArrayList<>();
					l.add(new newUser(a.id,a.name));
					table.put(b,l);
				}
			}
		}
		for(Address a:table.keySet())
		{
			System.out.println(table.get(a));
		}
		
		
		
	}
}
