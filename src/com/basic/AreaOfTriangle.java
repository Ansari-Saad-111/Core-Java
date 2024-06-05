package com.basic;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float area,b,h;
        System.out.println("Enter base");
        b=sc.nextFloat();
        System.out.println("Enter height");
        h=sc.nextFloat();
        area=0.5f*b*h;
        System.out.println("Area of triangle "+area);
	}

}
