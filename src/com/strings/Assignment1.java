package com.strings;

//Vowels are present or not
public class Assignment1 {

	public static void main(String[] args) {
		String s1="HelloiJava$123";
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count1++;
			}
		}
		System.out.println("Number of vowels are "+count1);
		if(count1>=1)
		{
			System.out.println("Vowels are present");
		}
		else {
			System.out.println("Vowels are not present");
		}
	}

}
