package com.classes;
import java.util.Scanner;

//Function overloading
class AverageOfThree
{
	void Average(int a,int b,int c) {
        System.out.println("Average of Three no. "+((a+b+c)/3));
	}
	void Average(float a,float b,float c) {
        System.out.println("Average of Three no. "+((a+b+c)/3));
	}
	void Average(double a,double b,double c) {
        System.out.println("Average of Three no. "+((a+b+c)/3));
	}
}

public class AverageMainClass {

	public static void main(String[] args) {
		int a,b,c;
		AverageOfThree a1=new AverageOfThree();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 no.");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        a1.Average(a,b,c);
        
        a1.Average(5.11f, 6.22f, 4.33f);
	}

}
