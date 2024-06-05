package com.jdbc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class InsertStudent extends JFrame
{
	JLabel l1=new JLabel("Roll no.");
	JLabel l2=new JLabel("Name");
	JLabel l3=new JLabel("Percentage");
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);	
	JTextField t3=new JTextField(10);	
	JButton b1=new JButton("Insert");
	JButton b2=new JButton("Update");
	JButton b3=new JButton("Delete");

	InsertStudent(){
		setVisible(true);
		setSize(300,200);
		setTitle("Student Form");
		setLayout(new FlowLayout());
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,2));
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2);
		add(p1);
		add(b3);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					int rollno;String name;float per;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

					rollno=Integer.parseInt(t1.getText());
					name=t2.getText();
					per=Float.parseFloat(t3.getText());
					PreparedStatement st=con.prepareStatement("insert into student values(?,?,?)");
					st.setInt(1, rollno);
					st.setString(2, name);
					st.setFloat(3, per);

					st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Inserted successfully");

					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}				
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					int rollno;String name;float per;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

					rollno=Integer.parseInt(t1.getText());
					name=t2.getText();
					per=Float.parseFloat(t3.getText());
					PreparedStatement st=con.prepareStatement("update student set name=?,per=? where rollno=?");	
					st.setString(1, name);
					st.setFloat(2, per);
					st.setInt(3, rollno);

					st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Updated successfully");

					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}				
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try
				{
					int rollno;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

					rollno=Integer.parseInt(t1.getText());
					PreparedStatement st=con.prepareStatement("delete from student where rollno=?");
					st.setInt(1, rollno);

					st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Deleted successfully");
					
					t1.setText("");

				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}				
			}
		});
	}
	public static void main(String[] args) {
		InsertStudent f1=new InsertStudent();
	}
}
