package com.ifelse;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three no.");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c) {
        	System.out.println("a is greater");
        }
        else if(b>a && b>c) {
        	System.out.println("b is greater");
        }
        else if(c>a && c>b){
        	System.out.println("c is greater");
        }
        else {
        	System.out.println("Equal");
        }
	}

}
