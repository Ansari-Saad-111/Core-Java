package com.io;

import java.io.*;

public class FileWriteRead {

	public static void main(String[] args) {
		try
		{
			//FileOutputStream fout=new FileOutputStream("C:\Users\saada\OneDrive\Desktop\Git Repo\Sample.txt");
			FileOutputStream fout=new FileOutputStream("Sample.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject("Hello");
			out.writeObject("Java");
			out.close();
			System.out.println("Success");
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		//-------------------------------------------------------------------
		try {
			FileInputStream fin=new FileInputStream("Sample.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			String s1=(String) in.readObject();
			System.out.println(s1);
			String s2=(String) in.readObject();
			System.out.println(s2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
