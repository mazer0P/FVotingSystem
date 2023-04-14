package com.mazer.votingsystem.utils;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

//import javax.swing.Timer;
//import java.awt.event.*;
//import java.awt.event.ActionEvent;
import javax.swing.*;

public class AdminPanel extends LoginPage implements ActionListener {

    
    JButton user,part,admin;
    JLabel l1,l2,admn;
    static int n;
    
   static String  Candidate[] = new String[100];
    int i =0;
    
    AdminPanel()
    {
        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(2000, 1000);
//        JOptionPane.showMessageDialog(null, "Reached Admin Panel"); 
//        String elec_name = JOptionPane.showInputDialog(null, "Please enter Election Name ");
//        setName(elec_name);
//        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number of Candidates" ));
//        for(int i =0;i<n;i++)
//        inDetails(n);
//        new verification(elec_name); 
    	frame.remove(panel);
        user = new JButton("Register User");
        user.addActionListener(this); 
        panel.add(user); 
        user.setVisible(true);
        user.setSize(150,50);
        user.setLocation(450, 500);
        user.setBackground(Color.ORANGE);
        user.setForeground(Color.BLACK);
        user.setFont(new Font("Times New Roman", Font.BOLD,15));
        /*
         * 
         */
        part = new JButton("Register Participant");
        part.addActionListener(this); 
        panel.add(part); 
        part.setVisible(true);
        part.setSize(150,50);
        part.setLocation(850, 900);
        part.setBackground(Color.ORANGE);
        part.setForeground(Color.BLACK);
        part.setFont(new Font("Times New Roman", Font.BOLD,15));
        frame.add(panel);
        setLayout(null);
        setVisible(true);
        admin = new JButton("Verify");
        admin.addActionListener(this); 
        panel.add(admin); 
        admin.setVisible(true);
       admin.setSize(150,50);
        admin.setLocation(850, 900);
        admin.setBackground(Color.ORANGE);
        admin.setForeground(Color.BLACK);
        admin.setFont(new Font("Times New Roman", Font.BOLD,15));
        frame.add(panel);
        setLayout(null);
        setVisible(true);
    }
//    public void inDetails(int num){
//
//            Candidate[i] = JOptionPane.showInputDialog(" Enter Candidate \t" +i +"\tName");
//            i++;
//    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == user)
        {
           new user();

        }
        else if(e.getSource() == part)
        {
           new participant();

        }
        else if(e.getSource() == admin)
        {
           try {
			new FR();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        }
        
}}
