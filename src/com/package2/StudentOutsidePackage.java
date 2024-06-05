package com.package2;

import com.package1.Student2;

//For protected
class StudentSubClass extends Student2{
	void studsin()
	{
		input();
	}
	void studout()
	{
		display();
	}
}
public class StudentOutsidePackage {

	public static void main(String[] args) {
		StudentSubClass s[]=new StudentSubClass[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new StudentSubClass();
			s[i].studsin();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].studout();
		}
	}

}

/*
//For public 
public class StudentOutsidePackage {

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
*/