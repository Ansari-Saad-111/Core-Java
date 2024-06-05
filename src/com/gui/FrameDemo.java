package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrameDemo extends JFrame implements ActionListener
{
	JButton b1=new JButton("Exit");
	FrameDemo(){
		setVisible(true);
		setSize(300,200);
		setTitle("Calculator");
		setLayout(new FlowLayout());
		add(b1);
		b1.addActionListener(this);
	}

	public static void main(String[] args) {
		FrameDemo f1=new FrameDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

}
