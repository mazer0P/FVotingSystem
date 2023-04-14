package com.mazer.votingsystem.utils;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginPage extends JFrame implements ActionListener{



    JFrame frame;
    JPanel panel;
    JButton b1,b2,admin;
    JLabel l1,l2,admn;
    LoginPage()
    {

        frame=new JFrame("FingerPrint Voting System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000, 1000);
        // File sourceimage = new File("D://paras/Technical Training/Technical Practice/output.png");
        // Image btn1 = ImageIO.read(sourceimage);
        // BufferedImage btn1 = ImageIO.read("D://paras/Technical Training/Technical Practice/output.png");
        //Icon btn1 = new ImageIcon("D:/modi.jpg");
        b1=new JButton("Registered");
        b1.addActionListener(this);  
        frame.add(b1);
        b1.setVisible(true);
        b1.setSize(150,50);
        b1.setLocation(450, 500);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Times New Roman", Font.BOLD,15));
        l1 = new JLabel("FingerPrint Based Voting System");
        l1.setBounds(150, 230, 800, 200);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        l1.setLocation(580,100);
        add(l1);
        frame.add(l1);
//        l2 = new JLabel("Un-Registered");
//        l2.setBounds(150, 230, 800, 200);
//        l2.setFont(new Font("Tahoma",Font.BOLD,20));
//        l2.setLocation(850,470);
//        add(l2);
//        frame.add(l2);
        // admn = new JLabel("Admin Panel Here");
        // admn.setBounds(150, 230, 800, 200);
        // admn.setFont(new Font("Tahoma",Font.BOLD,20));
        // admn.setLocation(1200,100);
        // add(admn);
        // frame.add(admn);
        setLayout(null);
        setVisible(true);
//        Icon btn2 = new ImageIcon("D:/paras/Technical Training/Technical Training/VotingSystem/icons/red.png");
        b2=new JButton("Un-Registered");  
        b2.addActionListener(this);  
        frame.add(b2);
        b2.setVisible(true);
        b2.setSize(150,50);
        b2.setLocation(850, 500);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Times New Roman", Font.BOLD,15));
        admin=new JButton("Admin Panel");  
        admin.addActionListener(this);  
        frame.add(admin);
        admin.setVisible(true);
        admin.setSize(150,50);
        admin.setLocation(1350, 50);
        admin.setBackground(Color.ORANGE);
        admin.setForeground(Color.BLACK);
        admin.setFont(new Font("Times New Roman", Font.BOLD,20));
        setLayout(null);
        setVisible(true);
        ImageIcon icon= new ImageIcon(("D:/paras/Technical Training/Technical Training/VotingSystem/icons/modi.jpg"));
        JLabel l3 = new JLabel(icon);
        l3.setBounds(400, 230, 800, 200);
        add(l3);
        l3.setLocation(350, 300);
        frame.add(l3);
        panel=new JPanel();
        panel.setBounds(50, 100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        frame.add(panel);
        frame.setVisible(true);

}
public static void main(String[] args) {
        new LoginPage();
    }  
    
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == b1)
        {
           new verification();

        }
        if(e.getSource() == b2)
        {
            JOptionPane.showMessageDialog(null,  "Kindly Contact Admin");
            // new loginpage();
        }
        if(e.getSource() == admin)
        {
            new loginadmin();
        }
        
    }  
}   
     
    
 
     


