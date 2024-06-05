package com.inheritance;

class Triangle{
	void area1(int b, int h) {
		System.out.println("Area of triangle is "+(0.5f*b*h));
	}
}
class Circle extends Triangle
{
	void area2(int r) {
		System.out.println("Area of circle is "+(3.14f*r*r));
	}
}
class Rectangle extends Circle
{
	void area3(int l, int b) {
		System.out.println("Area of rectangle is "+(l*b));
	}
}
public class MultipleInheritanceArea {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.area1(5, 10);
		r1.area2(5);
		r1.area3(5, 15);
	}

}
