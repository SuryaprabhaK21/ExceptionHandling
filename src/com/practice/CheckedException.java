package com.practice;
import java.io.FileWriter ;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class CheckedException {
	public static void main(String[] args)
	{
		FileWriter  fw;
		//Handled exception
		try
		{
			fw=new FileWriter ("C:\\Users\\surya.karuppusamy\\Desktop\\textfile.txt");
			fw.write("Hello");
			System.out.println("Saved");
			fw.close();
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
			System.out.println("Not saved");
		}
		
		//Unhandled exception
	/*	fw=new FileWriter ("C:\\Users\\surya.karuppusamy\\Desktop\\textfile.txt");
		fw.write("Hello");
		fw.close();*/
		
	}

}
