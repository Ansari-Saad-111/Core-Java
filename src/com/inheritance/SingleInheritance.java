package com.inheritance;

class A{
	int a=10;
	void display(){
		System.out.println("In A "+a);
	}
	void add(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
}
class B extends A
{
    int b=20;
    void show(){
		System.out.println("In B "+b);
	}
	void sub(int a, int b) {
		System.out.println("Subtraction is "+(a-b));
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
        B b1=new B();
        b1.display();
        b1.show();
        b1.add(10, 30);
        b1.sub(30, 20);
	}

}
