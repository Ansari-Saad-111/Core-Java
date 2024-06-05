package com.ifelse;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          int n;
          System.out.println("Enter no.");
          n=sc.nextInt();
          if(n>0) {
        	  System.out.println("Number is positive");
          }
          else {
        	  System.out.println("Number is negative");
          }
	}

}
