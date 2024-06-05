package com.methods;
//4)No parameter and with return type

import java.util.Scanner;

public class Method4 {

	public static void main(String[] args) {
		int c;
		c=add();
		System.out.println("Addtion is "+c);
	}
	static int add() {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return c;
	}

}
