package com.jdbc;
import java.sql.*;
public class Student 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("select * from student");
			ResultSet rs=st.executeQuery();
			System.out.println("RollNo  Name  Percentage");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"       "+rs.getString(2)+"    "+rs.getFloat(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}