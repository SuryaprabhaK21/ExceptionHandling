package com.practice;

abstract class Abstract 
{
	abstract void getNoOfWheels();
}
class Bus extends Abstract
{
	 void getNoOfWheels()
	{
		System.out.println("7");
	}
	public static void main(String[] args)
	{
		Bus bus=new Bus();
		bus.getNoOfWheels();
	}
}
