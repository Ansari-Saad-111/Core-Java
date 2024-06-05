package com.inheritance;
//Constructor in inheritance

class A2{
	int a=100;
	A2(int rollno)
	{
		System.out.println("In A "+rollno);
		System.out.println("A is "+a);
	}
}
class B2 extends A2
{
	int a=300;
	B2(int rollno,String name)
	{
		super(rollno);
		System.out.println("In B "+name);
		System.out.println("A is "+super.a);
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		B2 b=new B2(11,"Admin");
	}

}
