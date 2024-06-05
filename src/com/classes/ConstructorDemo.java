package com.classes;

class Sample
{
	Sample()//default constructor
	{
		System.out.println("Hello");
	}
	Sample(String name)//parameterized constructor
	{
		System.out.println("Hello "+name);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample("admin");
	}

}
