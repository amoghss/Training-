package com.answer9.main;

public abstract class WoodenFurniture extends Furniture{
	
	int fireResistance=50;
	
	// We override the FireTest for all Wooden because all will have same fire resistance
	
	@Override
	public void fireTest()                         
	{
		System.out.println("The Fire Resistance is"+ fireResistance);
	}
	
	// We do not touch the stress since all wood furniture can have different stress.
	

}
