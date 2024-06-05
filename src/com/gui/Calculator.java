package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame 
{
	JLabel l1=new JLabel("Enter 1st no.");
	JLabel l2=new JLabel("Enter 2nd no.");
	JLabel l3=new JLabel("Result");
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);	
	JTextField t3=new JTextField(10);	
	JButton b1=new JButton("ADD");
	JButton b2=new JButton("SUB");

	Calculator(){
		setVisible(true);
		setSize(300,200);
		setTitle("Calculator");
		setLayout(new FlowLayout());
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,5,5));
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2);
		add(p1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a+b;
				t3.setText(""+c);
			}
		});			
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a-b;
				t3.setText(""+c);
			}
		});
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();

	}

}
