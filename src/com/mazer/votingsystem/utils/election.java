package com.mazer.votingsystem.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
public class election implements ActionListener {

	 JFrame frame;
	    JPanel panel;
	    JButton b1,b2,admin;
		BufferedImage btn12;
	    JLabel l1,l2,admn;
	    Icon btn122;
	    int result=0;
	   public election() throws Exception
	    {

	        JFrame frame=new JFrame("FingerPrint Voting System");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(2000, 1000);
//	        File sourceimage = new File("D://paras/Technical Training/Technical Practice/output.png");
//	        Image btn1 = ImageIO.read(sourceimage);
	        btn12 = ImageIO.read(election.class.getResource("modi.jpg"));
	        btn122 = new ImageIcon(ImageIO.read(election.class.getResource("modi.jpg")));
	        b1=new JButton(btn122);
	        b1.addActionListener(this);  
	        frame.add(b1);
	        b1.setVisible(true);
	        b1.setSize(150,50);
	        b1.setLocation(450, 500);
	        b1.setBackground(Color.ORANGE);
	        b1.setForeground(Color.BLACK);
	        b1.setFont(new Font("Times New Roman", Font.BOLD,15));
	        JPanel j = new JPanel();
	        j.add(b1);
	        j.setVisible(true);
	        frame.add(j);
	        frame.setVisible(true);
//	        l1 = new JLabel("FingerPrint Based Voting System");
//	        l1.setBounds(150, 230, 800, 200);
//	        l1.setFont(new Font("Tahoma",Font.BOLD,20));
//	        l1.setLocation(580,100);
//	        add(l1);
//	        frame.add(l1);
}
//	   public static void main(String args[])  {
//		try {
//			new election();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			result++;
		}
		
	}
	   }
