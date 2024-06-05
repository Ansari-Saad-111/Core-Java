package com.io;
import java.io.Serializable;

public class Student implements Serializable
{
	int rollno;//4
	String name;//10
	float per;//4
    Student()//default constructor
    {
    	rollno=0;
    	name=null;
    	per=0;
    }
    Student(int rollno,String name,float per)//parameterized constructor
    {
     	this.rollno=rollno;
     	this.name=name;
     	this.per=per;
    }
    void display() {
		System.out.println("Roll No: "+rollno+" Name: "+name+" Percentage: "+per);
    }
}

