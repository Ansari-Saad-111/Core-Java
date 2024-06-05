package com.package1;

import java.util.Scanner;

public class Student2 {
	private int rollno;
	private String name;
	private float per;
	protected void input()	
	//public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno. Name and Percentage");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
	}
	protected void display()
	//public void display()
	{
		System.out.println("Roll No: "+rollno+" Name: "+name+" Percentage: "+per);
	}
}
