package com.basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float area,r;
        System.out.println("Enter radius");
        r=sc.nextFloat();
        area=3.14f*r*r;
        System.out.println("Area is "+area);
	}

}
