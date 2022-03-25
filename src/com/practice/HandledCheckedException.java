package com.practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HandledCheckedException {
	public static void main(String[] args)
	{
		
		//Unhandled exception
		/*PrintWriter pw=new PrintWriter("C:\\Users\\surya.karuppusamy\\Desktop\\textfile.txt");
		pw.println("Hello surya");
		pw.close();*/
		
		//Handled exception
		try
		{
			PrintWriter pw=new PrintWriter("C:\\Users\\surya.karuppusamy\\Desktop\\textfile1.txt");
			pw.println("Hello surya1");
			pw.close();
			System.out.println("printed");
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("Unavailable file");
		}
		
	}

}
