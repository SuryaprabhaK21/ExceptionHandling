package com.practice;

public class ExceptionHandling {
	public static void main(String[] args)
	{
		try
		{
			int number=10;
			System.out.println(number/0);
		}
		//1st method to catch exception
		catch(ArithmeticException arithmeticException)
		{
			System.out.println(arithmeticException);
			System.out.println("A number cannot be divided by zero");
		}
		
		//2nd method to catch exception
		
		
	}

}
