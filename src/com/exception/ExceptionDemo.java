package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 no.");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division is "+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Remaining program");
	}

}
