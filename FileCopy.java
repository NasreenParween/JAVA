import java.io.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class FileCopy {
	FileCopy(){

	JFrame f=new JFrame("Question 2");
	f.setLayout(new FlowLayout());
	f.setSize(700,500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel title=new JLabel("Enter the name of file(text.txt):");
	JLabel msg=new JLabel();
	JLabel error=new JLabel();

	JButton copy=new JButton("COPY");
	JTextField name=new JTextField(30);

	copy.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent a){

	String inputname=name.getText();
	int i;
	FileInputStream f1=null;
	FileOutputStream f2=null;

	try {
	f1=new FileInputStream(inputname);
	f2=new FileOutputStream("Javacopy.txt");
				
	do
	{
	i=f1.read();
	if(i!=-1)
	f2.write(i);
	}while(i!=-1);
	}
			
	catch(IOException o1)
	{
	error.setText("I/O Error: "+o1);
	}
			
	finally {
	try
	{
	if(f1!=null)f1.close();
	}
	catch(IOException o2) {
	error.setText("Error Closing Input File");
	}
	try
	{
	if(f2!=null)f2.close();
	}
	catch(IOException o2)
	{
	error.setText("Error Closing Output File");
	}
	}

	msg.setText("Your file has been copied to another file named Javacopy");

	}
	});

	f.add(title);
	f.add(name);
	f.add(copy);
	f.add(msg);
	f.add(error);
	f.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			new FileCopy();
			}
			});
	}

}
