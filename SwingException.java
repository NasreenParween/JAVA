import java.io.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class SwingException {
	SwingException()
	{
	JFrame f=new JFrame("Question 5");
	f.setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(400,500);
	JLabel title=new JLabel("Enter Age");
	JTextField age=new JTextField(20);
	JLabel msg=new JLabel();
	f.add(title);
	f.add(age);
	f.add(msg);

	age.addActionListener(new ActionListener() { 
	public void actionPerformed(ActionEvent a){
	int x;
	try{
	x=Integer.parseInt(age.getText());
	if(x<18) throw new Exception();
	else
	msg.setText("Age "+x); 
	}
	catch(Exception e){
	msg.setText("Underage!!");
	}
	}
	});

	f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
			new SwingException();
			}
			});
	}

}
