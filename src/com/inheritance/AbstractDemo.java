//Heirarchical Inheritance
//Method override(Runtime Polymorphism)
//Abstract class
package com.inheritance;
import java.util.Scanner;

abstract class Shape{
	float a;
	Scanner sc=new Scanner(System.in);
	abstract void area();
}
class Circle1 extends Shape{
	int r;
	@Override
	void area() {
		System.out.println("Enter radius");
		r=sc.nextInt();
		a=3.14f*r*r;
		System.out.println("Area is "+a);
	}	
}
class Rect extends Shape{
	int l,b;
	@Override
	void area() {
		System.out.println("Enter l and b");
		l=sc.nextInt();
		b=sc.nextInt();
		a=l*b;
		System.out.println("Area is "+a);		
	}

}
public class AbstractDemo {

	public static void main(String[] args) {
		Shape s1;
		Circle1 c=new Circle1();
		Rect r=new Rect();
		//c.area();
		//r.area();
		s1=c;
		s1.area();
		s1=r;
	    s1.area();
	}
}
