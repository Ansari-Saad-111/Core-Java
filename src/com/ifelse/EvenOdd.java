package com.ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter no.");
        n=sc.nextInt();
        if(n%2==0) {
        	System.out.println("Number is even");
        }
        else {
        	System.out.println("Number is odd");
        }
	}

}
