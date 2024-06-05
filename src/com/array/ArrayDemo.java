package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 no.");
        for(int i=0;i<=4;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++) {
        	System.out.println(a[i]);
        }
	}

}
