package com.inheritance;

class A1{
	void add(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
}
class B1 extends A1
{
	void sub(int a, int b) {
		System.out.println("Subtraction is "+(a-b));
	}
}
class C1 extends B1
{
	void mul(int a, int b) {
		System.out.println("Multiplication is "+(a*b));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
C1 c1=new C1();
c1.add(20, 20);
c1.sub(40, 20);
c1.mul(5, 2);
	}

}
