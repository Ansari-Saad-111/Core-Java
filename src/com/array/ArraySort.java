package com.array;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],t;
		System.out.println("Enter 5 no.");
		for(int i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=3-i;j++)//3-i is for not checking sorted number again & again 
			{
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
	}

}
