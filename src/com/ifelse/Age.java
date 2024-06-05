package com.ifelse;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter age");
        a=sc.nextInt();
        if(a>=18 && a<=60) {
        	System.out.println("Accepted");
        }
        else {
        	System.out.println("Not accepted");
        }
	}

}
