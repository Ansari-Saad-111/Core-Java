package com.loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int op,a,b,c;
		char ans;
		do {
			System.out.println("1.Addition");
			System.out.println("2.Subraction");
			System.out.println("Enter choice");
			op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter 2 no.");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a+b;
				System.out.println("Addtion is "+c);
				break;
			case 2:
				System.out.println("Enter 2 no.");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a-b;
				System.out.println("Subtraction is "+c);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do u want to continue");
			ans=sc.next().charAt(0);
		}
		while(ans=='y');
	}

}
