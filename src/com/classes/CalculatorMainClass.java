package com.classes;
import java.util.Scanner;

//Function overloading
class Calculator
{
	void add(int a,int b) {
		System.out.println("Addition is "+(a+b));
	}
	void add(float a,float b) {
		System.out.println("Addition is "+(a+b));
	}
	void add(double a,double b) {
		System.out.println("Addition is "+(a+b));
	}
}

public class CalculatorMainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator c1=new Calculator();
		c1.add(5.55f,6.22f);

		int a,b;
		System.out.println("Enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		c1.add(a, b);
	}

}
//Average of 3 no. in func overloading