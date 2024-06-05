package com.package1;

public class StudentWithinPackage {

	public static void main(String[] args) {
		Student2 s[]=new Student2[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student2();
			s[i].input();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}

}
