package com.mazer.votingsystem.utils;
import javax.swing.*;  
import java.awt.event.*;  

public class loginadmin extends LoginPage{
//initialize button, panel, label, and text field  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
       
    loginadmin()  
    {     
          
 
        userLabel = new JLabel();  
        userLabel.setText("Username");      //set label value for textField1  
          
          
        textField1 = new JTextField(15);    //set length of the text 
        
  
         
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        
        textField2 = new JPasswordField(15);    //set length for the password  
        
       
        b1 = new JButton("SUBMIT"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel();  
        newPanel.add(userLabel);    //set username label to panel
        
        newPanel.add(textField1);   //set text field to panel 
        
        newPanel.add(passLabel);    //set password label to panel
        
        newPanel.add(textField2);//set text field to panel
        
        newPanel.add(b1);           //set button to panel  
          
        //set border to panel   
//        add(newPanel, BorderLayout.CENTER);  
        frame.add(newPanel);
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
        setVisible(true);
        
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (userValue.equals("admin") && passValue.equals("pass")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
            new AdminPanel(); 
        }  
        else{  
            //show error message  
            JOptionPane.showMessageDialog(null, "Wrong Credentials"); 
        }  
    }  
} 