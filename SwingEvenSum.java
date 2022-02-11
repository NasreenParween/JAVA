import java.io.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class SwingEvenSum {
 SwingEvenSum()
 {
	JFrame f=new JFrame("Question 6");
	f.setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(800,300);

	JLabel number=new JLabel("Enter integers");
	JTextField even=new JTextField(50);
	JLabel sumeven=new JLabel();
	f.add(number);
	f.add(even);
	f.add(sumeven);

	even.addActionListener(new ActionListener() { 
	public void actionPerformed(ActionEvent ae){
	String str=even.getText();
	String s[]=new String[str.length()];
	s=str.split(" ");
	int a[]=new int[s.length];
	for(int i=0;i<s.length;i++)
	{
	a[i]=Integer.parseInt(s[i]);
	}

	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	sum=sum+a[i];
	}

	sumeven.setText("The sum of even numbers entered is "+sum);
	}
	});

	f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
			new SwingEvenSum();
			}
			});
	}

}
