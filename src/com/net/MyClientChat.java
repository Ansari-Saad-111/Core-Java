package com.net;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class MyClientChat {

	public static void main(String[] args)throws Exception 
	{
		Socket s=new Socket("localhost",123);//create client object
		System.out.println("Client connected");
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		
		String str1="",str2="";
		while(!str1.equals("stop"))
		{
			str1=sc.next();//hello
			dout.writeUTF(str1);//Unicode Transformation Format
			dout.flush();

			str2=din.readUTF();//hii
			System.out.println("Server says "+str2);
		}
		dout.close();
		s.close();

	}

}
