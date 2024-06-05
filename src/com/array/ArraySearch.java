package com.array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],n,count=0;
		System.out.println("Enter 5 no.");
		for(int i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no. to search");
		n=sc.nextInt();
		for(int i=0;i<=4;i++) {
			if(a[i]==n) {
				count++;
			}
		}
		System.out.println("Count is "+count);

	}

}
