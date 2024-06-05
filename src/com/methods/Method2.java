package com.methods;
//2)With parameter(input) and no return type(void)

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 No. ");
		a=sc.nextInt();
		b=sc.nextInt();
		add(a,b);
	}
	static void add(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("Addition is "+c);
	}

}