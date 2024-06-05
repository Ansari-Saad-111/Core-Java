package com.array;

import java.util.Scanner;

public class ArraySumOfEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5],i,sum=0;
		System.out.println("Enter 5 no.");
		for(i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		for(i=0;i<=4;i++)
		{
			if(a[i]%2==0) {
				sum=sum+a[i]; 
			}
		}
		System.out.println("Sum of even no. is "+sum);
	}

}
