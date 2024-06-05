package com.array;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],i,min;
		System.out.println("Enter 5 no.");
		for(i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(i=0;i<=4;i++) {
			if(a[i]<min) {
			min=a[i];
			}
		}
		System.out.println("Minimum no. is "+min);
	}

}
