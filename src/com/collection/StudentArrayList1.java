package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList1 {

	public static void main(String[] args) {
		int rollno,option,flag=0;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> a1=new ArrayList<Student>();

		while(true) {
			System.out.println("\n1>Add student");
			System.out.println("2>Display student");
			System.out.println("3>Search by name");
			System.out.println("4>Search by roll number");
			System.out.println("5>Delete student");
			System.out.println("Enter option");
			option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter RollNo Name Percentage");
				rollno=sc.nextInt();
				name=sc.next();
				per=sc.nextFloat();
				Student s1=new Student(rollno,name,per);
				a1.add(s1);
				break;
			case 2:
				for (Student s : a1) {
					s.display();
				}
				break;
			case 3:
				String n;
				System.out.println("Enter name to search");
				n=sc.next();
				for(Student s :a1) {
					if(s.name.equalsIgnoreCase(n)) {
						System.out.println("Found");
						s.display();
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Not found");
				}
				break;
			case 4:
				int r;
				System.out.println("Enter roll no. to search");
				r=sc.nextInt();
				for(Student s :a1) {
					if(s.rollno==r) {
						System.out.println("Found");
						s.display();
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Not found");
				}
				break;
			case 5:
				System.out.println("Enter name to delete");
				n=sc.next();
				for(Student s :a1) {
					if(s.name.equalsIgnoreCase(n)) {
						a1.remove(s);
						System.out.println("Student removed");
						break;
					}
					break;
				}
			}
		}
		
	}

}
