import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  class Hello implements ActionListener{
  	public JFrame f;
  	public JButton b;
  	public JTextField t;
  	public JLabel l; 
  	 				Hello(){
  	 	
  	 	 f=new JFrame("Task");
  	 	 l=new JLabel("Write something above");
  	 	 l.setBounds(50,100,150,30);
  		 b=new JButton("  Click  ");
  		 b.setBounds(50,150,200,30);
  		 b.addActionListener(this);
  		 t=new JTextField();
  		 t.setBounds(50,50,200,30);
  	    f.add(t);
  		f.add(l);
  		f.add(b);
  		f.setSize(500,500);
  		f.setLayout(null);
  		f.setVisible(true);
  		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	}
  	public void actionPerformed(ActionEvent e){
  		
  			String s1=t.getText();
  			String s2=String.valueOf(s1);
  			l.setText(s2);
  		
  	}
  }
  class Assignment2{
  	public static void main(String[] args) {
  		new Hello();
  	}
  }