package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 no.");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition is "+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		finally {
			System.out.println("Remaining program");
		}
	}

}
