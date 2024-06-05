package com.array;

import java.util.Scanner;

public class ReverseArray {

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
        System.out.println("Reverse array");
        for(int i=4;i>=0;i--) {
        	System.out.println(a[i]);
        }
	}

}
