package com.io;
import java.io.*;
import java.util.Scanner;
/*
public class StudentWriteRead {

	public static void main(String[] args) {
		int rollno;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		try {
			FileOutputStream fout=new FileOutputStream("Student.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout); 
			
			System.out.println("Enter Rollno. Name and Percentage");
			rollno=sc.nextInt();
			name=sc.next();
			per=sc.nextFloat();
			Student s1=new Student(rollno,name,per);
			out.writeObject(s1);
			out.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		//-------------------------------------------------------------
		try {
			FileInputStream fin=new FileInputStream("Student.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			Student s1=(Student) in.readObject();
			s1.display();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}*/

public class StudentWriteRead
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		float per;
		try
		{
			FileOutputStream fout=new FileOutputStream("Student.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			Student s[]=new Student[3];
			for(i=0;i<s.length;i++) 
			{
				System.out.println("Enter RollNo Name Percentage");
				rollno=sc.nextInt();
				name=sc.next();
				per=sc.nextFloat();
				s[i]=new Student(rollno,name,per);
				out.writeObject(s[i]);
			}
			
			out.close();
			System.out.println("Success");
		}
		catch( Exception e)
		{
			System.err.println(e.getMessage());
		}

		try
		{
			FileInputStream fin=new FileInputStream("Student.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			//Student s2=(Student) in.readObject();
			Student s[]=new Student[3];
			for (i = 0; i <s.length; i++)
			{
                Student s1 = (Student) in.readObject();
                s1.display();
            }	
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}