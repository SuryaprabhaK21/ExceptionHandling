package com.practice;

public class DifferentExceptionClass extends java.lang.Exception {
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
			System.out.println("Hello");//this statement is not executed
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.out.println(arrayIndexOutOfBoundsException);//Exception is not handled here because of invalid exception class
			System.out.println("Enter valid number,a number cannot be divided by zero.");
		}
		catch(ArithmeticException arithmeticException) 
		{
			System.out.println(arithmeticException);
			System.out.println("Enter valid number,a number cannot be divided by zero.");
		}
		catch(java.lang.Exception e)
		{
			System.out.println("Enter valid number,a number cannot be divided by zero.");
		}
		
	}

}
