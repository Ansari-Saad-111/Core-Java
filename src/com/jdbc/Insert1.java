package com.jdbc;
import java.sql.*;

public class Insert1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("insert into student values(5,'abc',88)");
			st.executeUpdate();
			System.out.println("Inserted successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
