package com.mazer.votingsystem.utils;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class participant extends LoginPage implements ActionListener{
	JButton b1,image;  
	JPanel newPanel;  
	JLabel nameLabel, mobileLabel,email,addr;  
	final JTextField  textField1, textField2,emaili,addre; 
	String name;
	String phone;
	String emailid;
	String address;
	public participant() {
		nameLabel = new JLabel();  
        nameLabel.setText("Candidate's Name");        
        textField1 = new JTextField(15);    
        mobileLabel = new JLabel();  
        mobileLabel.setText("Mobile Number");       
        textField2 = new JTextField(15); 
        email = new JLabel();  
        email.setText("Email ID");        
        emaili = new JTextField(20); 
        addr = new JLabel();  
        addr.setText("Address");        
        addre = new JTextField(30); 
        b1 = new JButton("SUBMIT");
        b1.addActionListener(this);
        image = new JButton("Browse Image");
        image.addActionListener(this);
        newPanel = new JPanel();  
        newPanel.add(nameLabel);     
        newPanel.add(textField1);  
        newPanel.add(mobileLabel);     
        newPanel.add(textField2);
        
        newPanel.add(email);     
        newPanel.add(emaili);  
        newPanel.add(addr);     
        newPanel.add(addre);
        newPanel.add(b1);
        newPanel.add(image);
        frame.add(newPanel);  
            //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
        setVisible(true);
         name = textField1.getText();
         phone = textField2.getText();
         emailid = emaili.getText();
         address = addre.getText();
        
	}
	public void showParticipant() {
		JPanel newP = new JPanel(); 
    	JLabel namel = new JLabel();  
    	namel.setText(name);
        JLabel emaill = new JLabel();  
        emaill.setText(emailid);
        JLabel phonel = new JLabel();  
        phonel.setText(phone);
        JLabel addl = new JLabel();  
        addl.setText(address);
        newP = new JPanel();
        newP.setBounds(50, 100,300,300);
        newP.setLayout(new GridLayout(4,4,10,10));
        newP.add(namel);
        newP.add(emaill);
        newP.add(phonel);
        newP.add(addl);
        frame.add(newP);
        newP.setVisible(true);
        setTitle("LOGIN FORM");         
        setVisible(true);
	}
	@Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if(e.getSource() == b1)
        {
        	showParticipant();
        	

        }
        else if(e.getSource() == image)
        {
        	    JFileChooser fileChooser = new JFileChooser();
        	    int response =fileChooser.showOpenDialog(null);
        	    if(response==JFileChooser.APPROVE_OPTION) {
        	    	File path = new File(fileChooser.getSelectedFile().getAbsolutePath()) ;
        	    	System.out.println(path);
        	    }

        }
}
}