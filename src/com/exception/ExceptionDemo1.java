package com.exception;
import java.util.Scanner;

public class ExceptionDemo1 {

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
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Remaining program");
	}

}
