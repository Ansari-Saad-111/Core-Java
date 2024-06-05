package com.classes;

import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	float per;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno. Name and Percentage");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Roll No: "+rollno+" Name: "+name+" Percentage: "+per);
	}
}
public class StudentMainClass {

	public static void main(String[] args) {
		//Student sa=new Student();
		//Student s1;
		//s1=new Student();
		//s1.input();
		//s1.display();
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			s[i].input();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
		/*//==============================================
		String n;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to search");
		n=sc.next();
		for(int i=0;i<=2;i++) {
			if(s[i].name.equalsIgnoreCase(n)) {
				System.out.println("Found");
				s[i].display();
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Not found");
		}
        //============================================
		int r;
		System.out.println("Enter roll no. to search");
		r=sc.nextInt();
		for(int i=0;i<=2;i++) {
			if(s[i].rollno==r) {
				System.out.println("Found");
				s[i].display();
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Not found");
		}
		//============================================
		float max;
		max=s[0].per;
		for(int i=0;i<=2;i++) {
			if(s[i].per>max) {
				max=s[i].per;
			}
		}
		System.out.println("Maximum percentage is "+max);
		System.out.println("Student detail with maximum percentage");
		for(int i=0;i<=2;i++) {
			if(s[i].per==max) {
				s[i].display();
			}
		}
		*/
		//===================================================
		float t;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1-i;j++)//3-i is for not checking sorted number again & again 
			{
				if(s[j].per>s[j+1].per) {
					t=s[j].per;
					s[j].per=s[j+1].per;
					s[j+1].per=t;
				}
			}
		}
		System.out.println("Percentage in ascending");
		for(int i=0;i<=2;i++) {
			System.out.println(s[i].per);
			//s[i].display();
		}
	}

}
