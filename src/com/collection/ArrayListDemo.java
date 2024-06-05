package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer> a1=new ArrayList<Integer>();
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
        a1.add(50);
        System.out.println(a1);
        a1.add(3, 35);
        System.out.println(a1);
        
        a1.remove(2);
        System.out.println(a1);
        System.out.println(a1.contains(35));
        System.out.println(a1.indexOf(35));
        System.out.println(a1.size());
        System.out.println(a1.get(0));
        for (Integer i : a1) {
			System.out.println(i);
		}
	}

}
