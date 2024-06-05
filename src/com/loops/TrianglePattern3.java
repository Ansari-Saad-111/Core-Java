package com.loops;

public class TrianglePattern3 {

	public static void main(String[] args) {
		int n=65;
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(" "+(char)n++);
				System.out.print(" "+ch++);
			}
			System.out.println();
		}
	}

}
