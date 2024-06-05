package com.array;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],i,max;
		System.out.println("Enter 5 no.");
		for(i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=0;i<=4;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum no. is "+max);
	}

}
