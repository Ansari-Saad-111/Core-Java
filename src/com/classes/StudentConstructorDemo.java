package com.classes;
import java.util.Scanner;

class Student1
{
	int rollno;//4
	String name;//10
	float per;//4
    Student1()//default constructor
    {
    	rollno=0;
    	name=null;
    	per=0;
    }
    Student1(int rollno,String name,float per)//parameterized constructor
    {
     	this.rollno=rollno;
     	this.name=name;
     	this.per=per;
    }
    void display() {
		System.out.println("Roll No: "+rollno+" Name: "+name+" Percentage: "+per);
    }
}

public class StudentConstructorDemo {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rollno;
    	String name;
    	float per;
    	
    	/*Student1 s1=new Student1();
    	s1.display();
    	
    	Student1 s2=new Student1(11,"Admin",68);
    	s2.display();
    	
    	System.out.println("Enter Rollno. Name and Percentage");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
		Student1 s3=new Student1(rollno,name,per);
		s3.display();*/
    	
		Student1 s[]=new Student1[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Rollno. Name and Percentage");
			rollno=sc.nextInt();
			name=sc.next();
			per=sc.nextFloat();
			s[i]=new Student1(rollno,name,per);
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}

}
