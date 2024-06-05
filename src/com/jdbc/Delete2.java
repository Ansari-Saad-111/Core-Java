package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Delete2 {

	public static void main(String[] args) {
		int rollno;
		Scanner sc=new Scanner(System.in);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			while(true)
			{
				System.out.println("Enter rollno");
				rollno=sc.nextInt();
				PreparedStatement st=con.prepareStatement("delete from student where rollno=?");
				st.setInt(1, rollno);

				st.executeUpdate();
				System.out.println("Deleted successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
