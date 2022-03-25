package com.practice;

public class PrintStackTrace {
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();//to print all the information
			System.out.println(e);//to print the name and description of excep
			System.out.println(e.toString());//to print the name and description of excep
			System.out.println(e.getMessage());//to print only the description of excep
		}
	}

}
