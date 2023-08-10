package simple.minds;

import javax.swing.*;
import java.awt.*;
import java. awt.event.*;
import simple.minds.SimpleMinds;
public class Rules extends JFrame implements ActionListener{

JButton b1,b2;
String username;
Rules(String username) {
    this.username = username;
setBounds(600,200,800,650);
getContentPane().setBackground(Color.WHITE);
setLayout(null);

JLabel l1=new JLabel("Welcome"+username +" to Simple Minds");
l1.setForeground(new Color(30,144,255));
l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
l1.setBounds(50,20,700,30);
add(l1);

JLabel l2= new JLabel("");
l2.setFont(new Font("Tohoma",Font.PLAIN,16));
l2.setBounds(20,90,600,350);
l2.setText(
"<html>"+
"1.The examination will comprise of objective type Multiple choice question."+"<br><br>"+
"2.Read the entire question." +"<br><br>"+
"3.Select the correct Answer."+"<br><br>"+
"4.Answer the question you know first."+"<br><br>"+
"5.All question are compulsory and each carries one mark."+"<br><br>"+
"6.The topics covered in the exam will be as per the Syllabus"+"<br><br>"+
"<html>"
);
add(l2);

 b1=new JButton("Back");
b1.setBounds(250,500,100,30);
b1.setBackground(new Color(30,144,255));
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
add(b1);

 b2=new JButton("Start");
b2.setBounds(400,500,100,30);
b2.setBackground(new Color(30,144,255));
b2.setForeground(Color.WHITE);
b2.addActionListener(this);
add(b2);

setVisible(true);
}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		this.setVisible(false);
		new SimpleMinds().setVisible(true);
	}else if(e.getSource()== b2){
            this.setVisible(false);
	new Quiz(username).setVisible(true);
	}
	
}

public static void main(String[] args){
new Rules("");
}
}