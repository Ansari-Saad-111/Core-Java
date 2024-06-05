package com.jdbc;
import java.sql.*;

public class Delete1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("delete from student where rollno=6");
			st.executeUpdate();
			System.out.println("Deleted successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
