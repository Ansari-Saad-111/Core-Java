package com.loops;

public class TrianglePattern2 {

	public static void main(String[] args) {
		int n=15;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				//System.out.print(" "+n--);
			}
			System.out.println();
		}
	}

}

/*for(int i=1;i<=5;i++) {
	for(int j=i;j<=5;j++) {
		//System.out.print("*");
	}
	System.out.println();
}*/
