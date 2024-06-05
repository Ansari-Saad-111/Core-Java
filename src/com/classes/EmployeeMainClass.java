package com.classes;
import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	int sal;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee_Id Name Salary");
		empid=sc.nextInt();
		name=sc.next();
		sal=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee Id: "+empid+" Name: "+name+" Salary: "+sal);
	}
}
public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			e[i].input();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}

	}

}
