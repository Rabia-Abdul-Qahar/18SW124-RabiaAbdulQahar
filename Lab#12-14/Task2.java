import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Task2 extends JFrame{
	JPanel panel=new JPanel();
	JButton b1=new JButton("BUTTON1");
	BorderLayout bor=new BorderLayout();

	Task2(){

		panel.setLayout(bor);
		panel.add(b1,BorderLayout.SOUTH);
		add(panel);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Task2();
	}

	
}