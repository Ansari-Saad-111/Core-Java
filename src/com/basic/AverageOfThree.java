package com.basic;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double avg,a,b,c;
        System.out.println("Enter 1st no.");
        a=sc.nextInt();
        System.out.println("Enter 2nd no.");
        b=sc.nextInt();
        System.out.println("Enter 3rd no.");
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("Average of Three no. "+avg);
	}

}
