package com.jdbc;
import java.sql.*;

public class Update1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			
			PreparedStatement st=con.prepareStatement("update student set name='Admin1',per=89 where rollno=6");
			st.executeUpdate();
			System.out.println("Updated successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
