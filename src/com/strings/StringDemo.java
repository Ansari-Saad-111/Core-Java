package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1="abcxyz@gmail.com";
		System.out.println(s1);
		char ch=s1.charAt(0);
		System.out.println(ch);
		System.out.println(s1.charAt(0));
				
		int len=s1.length();
		System.out.println(len);
		System.out.println(s1.length());
		if(len==10) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		int index=s1.indexOf("24212");
		System.out.println(index);
		
		System.out.println(s1.equals("abc"));
		System.out.println(s1.equalsIgnoreCase("Abc"));

		System.out.println(s1.startsWith("+91"));
		System.out.println(s1.endsWith("@gmail.com"));
		
		System.out.println(s1.contains("@"));
		
		if(s1.indexOf('@')!=0 && s1.indexOf('@')==s1.lastIndexOf('@')) {
			System.out.println("@ Present");
		}
		else {
			System.out.println("Not present or more than one @");
		}
	}

}
