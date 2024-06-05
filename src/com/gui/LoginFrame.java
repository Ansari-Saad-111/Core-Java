package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginFrame extends JFrame implements ActionListener
{
	JLabel l1=new JLabel("Username");
	JLabel l2=new JLabel("Password");
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);	
	JButton b1=new JButton("Login");

	LoginFrame(){
		setVisible(true);
		setSize(240,200);
		setTitle("Login Form");
		setLayout(new FlowLayout());
		add(l1); add(t1);
		add(l2); add(t2);
		add(b1); 
		b1.addActionListener(this);
	}

	public static void main(String[] args) {
		LoginFrame f1=new LoginFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user=t1.getText();
		String pass=t2.getText();
		if(user.equals(pass))
		{
			JOptionPane.showMessageDialog(null, "Login succesfully");
		}
		else {
			JOptionPane.showMessageDialog(null, "Login fail");
		}
	}

}
