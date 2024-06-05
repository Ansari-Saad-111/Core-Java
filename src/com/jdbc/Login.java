package com.jdbc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame
{
	JLabel l1=new JLabel("Username");
	JLabel l2=new JLabel("Password");
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);	
	JButton b1=new JButton("Login");

	Login(){
		setVisible(true);
		setSize(240,200);
		setTitle("Login Form");
		setLayout(new FlowLayout());
		add(l1); add(t1);
		add(l2); add(t2);
		add(b1); 
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user=t1.getText();
				String pass=t2.getText();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
					
					PreparedStatement st=con.prepareStatement("select * from user where username=? and password=?");
					st.setString(1, user);
					st.setString(2, pass);
					
					ResultSet rs=st.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login succesfully");
						InsertStudent f1=new InsertStudent();
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Login fail");
					}
				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}
			}
		});
	}
		
	public static void main(String[] args) {
		Login f1=new Login();
	}

}
