package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Insert2 {

	public static void main(String[] args) {
		int rollno;String name;float per;
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			while(true)
			{
				System.out.println("Enter rollno,name and per");
				rollno=sc.nextInt();
				name=sc.next();
				per=sc.nextFloat();
				PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
				st.setInt(1, rollno);
				st.setString(2, name);
				st.setFloat(3, per);
				
				st.executeUpdate();
				System.out.println("Inserted successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
