package com.mazer.votingsystem.utils;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class verification extends LoginPage implements ActionListener{
	
	    // JFrame frame;
	    // JPanel panel;
	    // JButton b1,b2;
	    // JLabel l1,l2;
	verification()
	    {
	        // frame=new JFrame(s);
	        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        // frame.setSize(2000, 1000);
		frame.remove(panel);
	        b1=new JButton("Show Result");
	        b1.addActionListener(this);  
	        frame.add(b1);
	        b1.setVisible(true);
	        b1.setSize(150,50);
	        b1.setLocation(550, 500);
	        // b1.setBackground(Color.ORANGE);
	        b1.setForeground(Color.BLACK);
	        b1.setFont(new Font("Times New Roman", Font.BOLD,20));
	        setLayout(null);
	        setVisible(true);
	        // frame.setVisible(true);
	    }
	    
	        public void actionPerformed(ActionEvent e) throws HeadlessException {
	            if(e.getSource() == b1)
	            {
	            	try {
						new FR();
						int a = FR.result;
						System.out.println(a);
						if(a==0) {
							JOptionPane.showMessageDialog(null, "Matched you Can vote");
							new election();
						}
						else {
							JOptionPane.showMessageDialog(null, "Not-Matched Kindly contact Admin");
						}
							
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
//	                for(int i=0;i<AdminPanel.n;i++)
//						try {
//							JOptionPane.showMessageDialog(null,AdminPanel.Candidate[i]);
//						} catch (HeadlessException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//	            }
	            }
	        }
	    }
