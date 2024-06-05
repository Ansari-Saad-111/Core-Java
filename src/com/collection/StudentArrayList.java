package com.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

	public static void main(String[] args) {
		int rollno;//4
		String name;//10
		float per;//4
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student(1,"aaa",88);
		Student s2=new Student(2,"bbb",78);
        a1.add(s1);
        a1.add(s2);
        for (Student s : a1) {
			s.display();
		}
        System.out.println("Enter RollNo Name Percentage");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
		Student s3=new Student(rollno,name,per);
        a1.add(s3);
        for (Student s : a1) {
			s.display();
		}
	}

}
