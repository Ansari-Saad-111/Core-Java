package com.inheritance;
import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno. and Name ");
		rollno=sc.nextInt();
		name=sc.next();
	}
	void display()
	{
		System.out.println("Roll No: "+rollno+" Name: "+name);
	}

}
class Result extends Student
{
	int sub1,sub2,total;
	void input1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject1 and Subject2 marks ");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		total=sub1+sub2;
	}
	void display1()
	{
		System.out.println("Subject 1: "+sub1+"Subject 2: "+sub2+"Total: "+total);
	}
}
public class StudentConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
