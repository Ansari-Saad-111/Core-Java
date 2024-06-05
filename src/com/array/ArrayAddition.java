package com.array;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],b[]=new int[5],c[]=new int[5],i;
		System.out.println("Enter 5 no. for array a");
		for(i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array a");
		for(i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter 5 no. for array b");
		for(i=0;i<=4;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Array b");
		for(i=0;i<=4;i++) {
			System.out.println(b[i]);
		}
		System.out.println("Addition of two arrays");
		for(i=0;i<=4;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}

}

