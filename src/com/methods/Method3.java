package com.methods;
//3)With parameter and with return type

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 No. ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=add(a,b);
		System.out.println("Addition is "+c);
	}
	static int add(int a,int b) 
	{
		int c;
		c=a+b;
		return c;
	}

}
