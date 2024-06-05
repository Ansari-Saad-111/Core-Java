package com.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		char ans;
		do {
			System.out.println("Enter 2 no.");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition is "+c);
			System.out.println("Do u want to continue");
			ans=sc.next().charAt(0);
		}
		while(ans=='y');
	}

}
