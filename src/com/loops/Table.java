package com.loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int i=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		n=sc.nextInt();
		while(i<=10) {
			System.out.println(i*n);
			i++;
		}
	}

}
