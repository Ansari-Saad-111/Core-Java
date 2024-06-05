package com.net;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class MyServerChat {

	public static void main(String[] args)throws Exception 
	{
		ServerSocket ss=new ServerSocket(123);//create object of new server
		System.out.println("Server started");
		Socket s=ss.accept();
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		
		String str1="",str2="";
		while(!str1.equals("stop"))
		{
			str1=din.readUTF();//hello
			System.out.println("Client says "+str1);
			
			str2=sc.next();//hii
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();

	}

}
