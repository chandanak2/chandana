package ajproj;


import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener {

    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    LoginDemo() {
    	
    	JTextArea textArea = new JTextArea(
        	    "Dayananda Sagar College of Engineering which was established in 1979 is located here. "
        	    + "The area is home to eminent Kannada writers like Sri Jayanta Kaykini, Sri A.N."
        	    + " Prahlada Rao and Sri B.S. Keshava Rao."
        	);
        	textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        	textArea.setLineWrap(true);
        	textArea.setWrapStyleWord(true);
        	
        // User Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        
        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3,1));
        panel.add(textArea);
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);  
        panel.add(password_text);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Welcome to Dayananda Sagar");
        setSize(300, 300);
        setVisible(true);
      
        

    }
  
    public static void main(String[] args) {
        new LoginDemo();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
          if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText(" Hello " + userName
                    + "");
        } else {
            message.setText(" Invalid user.. ");
        }

    }

}