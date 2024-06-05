package com.loops;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		for(int i=1;i<=4;i++) {
			System.out.println("Enter 2 no.");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition is "+c);
		}
	}

}
