package com.array;

import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],n,flag=0,i;
		System.out.println("Enter 5 no.");
		for(i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no. to search");
		n=sc.nextInt();
		for(i=0;i<=4;i++) {
			if(a[i]==n) {
				System.out.println("Found");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Not found");
		}
	}

}
