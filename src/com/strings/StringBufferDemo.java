package com.strings;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter name");
		//String s=sc.next();
		//StringBuffer s1=new StringBuffer(s);
		StringBuffer s1=new StringBuffer("Nashik");
		System.out.println(s1);
		s1.append(1234);//insert at the end
		System.out.println(s1);
		
        s1.insert(6, "Java");//insert at the specific index
		System.out.println(s1);
        
		s1.deleteCharAt(10);//delete single char by index
		System.out.println(s1);
        s1.delete(6, 10);//start,end+1
		System.out.println(s1);
        
		s1.replace(6, 8, "Java");//start,end+1,new string
		System.out.println(s1);

		s1.reverse();
		System.out.println(s1);

	}

}
