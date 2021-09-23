package com.answer9.main;

public class MainClass {
	public static void main(String args[])
	{
		Furniture MetalObj1=new MetalFurnitureChair();
		Furniture MetalObj2=new MetalFurnitureTable();
		
		Furniture WoodenObj1=new WoodenFurnitureChair();
		Furniture WoodenObj2=new WoodenFurnitureTable();
		
		MetalObj1.name();
		MetalObj1.fireTest();
		MetalObj1.stress();
		
		System.out.println("------------------");
		
		MetalObj2.name();
		MetalObj2.fireTest();
		MetalObj2.stress();
		
		System.out.println("------------------");
		
		WoodenObj1.name();
		WoodenObj1.fireTest();
		WoodenObj1.stress();
		
		System.out.println("------------------");
		
		WoodenObj2.name();
		WoodenObj2.fireTest();
		WoodenObj2.stress();
		
	}

}
