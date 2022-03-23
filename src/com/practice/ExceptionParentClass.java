package com.practice;
import java.util.InputMismatchException;
import java.util.*;

public class ExceptionParentClass{
	int a;
	public static void main(String[] args) {
		ExceptionParentClass ed=new ExceptionParentClass();
		try
		{
			
			Scanner sc=new Scanner(System.in);
			ed.a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(ed.a);
			System.out.println("surya");
		}
		
	}
	
}

