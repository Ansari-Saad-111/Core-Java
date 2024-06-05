package com.inheritance;

interface I1{
	void add(int a,int b);
}
interface I2{
	void sub(int a,int b);
}
class Sample implements I1,I2{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition is "+(a+b));		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction is "+(a-b));		

	}

}
public class InterfaceDemo {

	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.add(10, 20);
		s1.sub(30, 10);
	}

}
