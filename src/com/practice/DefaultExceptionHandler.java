package com.practice;

public class DefaultExceptionHandler {
	public static void main(String[] args)
	{
		DefaultExceptionHandler a=new DefaultExceptionHandler();
		a.doStuff();
	}
	public  void doStuff()
	{
		doMoreStuff();
	}
	public void doMoreStuff()
	{
		System.out.println(10/0);
	}

}
