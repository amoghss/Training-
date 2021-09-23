package com.answer9.main;

public abstract class MetalFurniture extends Furniture {

	int fireResistance=100;
	
	// We override the FireTest for all Metal childs because all will have same fire resistance
	
	@Override
	public void fireTest()                         
	{
		System.out.println("The Fire Resistance is"+ fireResistance);
	}
	
	// We do not touch the stress since all metal furniture can have different stress.
	

}
