import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
public class SwingCalculator {
	double ans,x,y;
	SwingCalculator()
	{
	JFrame f=new JFrame ("Question 1");
	f.setLayout(new FlowLayout());
	f.setSize(500,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel n1=new JLabel("Enter first number");
	JLabel n2=new JLabel("Enter second number");
	JButton addition= new JButton("+");
	JButton subtraction= new JButton("-");
	JButton multiplication= new JButton("*");
	JButton division= new JButton("/");
	JButton equalto=new JButton("=");
	JTextField input1=new JTextField(20);
	JTextField input2=new JTextField(20);
	JLabel display=new JLabel();
	JLabel sol=new JLabel();

	f.add(n1);
	f.add(input1);
	f.add(n2);
	f.add(input2);
	f.add(addition);
	f.add(subtraction);
	f.add(multiplication);
	f.add(division);
	f.add(equalto);
	f.add(display);
	f.add(sol);

	addition.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent a)
	{
	x=Double.parseDouble(input1.getText());
	y=Double.parseDouble(input2.getText());
	ans=x+y;
	display.setText(x+"+"+y);
	sol.setText(" ");
	}
	});

	subtraction.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent a)
	{
	x=Double.parseDouble(input1.getText());
	y=Double.parseDouble(input2.getText());
	ans=x-y;
	display.setText(x+"-"+y);
	sol.setText(" ");
	}
	});

	multiplication.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent a)
	{
	x=Double.parseDouble(input1.getText());
	y=Double.parseDouble(input2.getText());
	ans=x*y;
	display.setText(x+"*"+y);
	sol.setText(" ");
	}
	});

	division.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent a)
	{
	x=Double.parseDouble(input1.getText());
	y=Double.parseDouble(input2.getText());
	ans=x/y;
	display.setText(x+"/"+y);
	sol.setText(" ");
	}
	});

	equalto.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent a)
	{
	sol.setText("="+ans);
	}
	});


	f.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
		public void run()
		{
		new SwingCalculator();
		}
		});
	}

}
