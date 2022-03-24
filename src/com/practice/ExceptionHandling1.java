package com.practice;

public class ExceptionHandling1 {
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
			System.out.println("Hello");//this statement is not executed
		}
		catch(ArithmeticException arithmeticException)
		{
			System.out.println(arithmeticException);
			System.out.println("Enter valid number,a number cannot be divided by zero.");
		
		}
	}

}
