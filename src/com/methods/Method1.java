package com.methods;
//1)No parameters and no return type(void)

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		hello();
		add();
	}
	static void hello() {
		System.out.println("Hello");
	}
	static void add() {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addtion is "+c);

	}

}
/*
Function-Create once and call one and more time
-pre define 
-user define
*/