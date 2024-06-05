package com.methods;
import java.util.Scanner;

public class Method2Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("Enter Radius");
		r=sc.nextInt();
		area(r);
	}
	static void area(int r)
	{
		float a;
		a=3.14f*r*r;
		System.out.println("Area is "+a);
	}

}
