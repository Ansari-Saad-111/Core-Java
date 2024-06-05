package com.loops;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int op;
		float area,r,b,h;
		char ans;
		do {
			System.out.println("1.Area of circle");
			System.out.println("2.Area of triangle");
			System.out.println("Enter choice");
			op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter radius");
		        r=sc.nextFloat();
		        area=3.14f*r*r;
		        System.out.println("Area is "+area);
				break;
			case 2:
		        System.out.println("Enter base");
		        b=sc.nextFloat();
		        System.out.println("Enter height");
		        h=sc.nextFloat();
		        area=0.5f*b*h;
		        System.out.println("Area of triangle "+area);
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
