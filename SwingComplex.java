import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class SwingComplex {
	double ansr,ansi,a,b,c,d;
	JLabel sol,x1,x2,y1,y2;
	SwingComplex()
	{
	JFrame f=new JFrame ("Question 4");
	f.setLayout(new FlowLayout());
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	x1=new JLabel("Enter REAL PART of first number ");
	y1=new JLabel("Enter IMAGINARY PART of first number");
	x2=new JLabel("Enter REAL PART of second number");
	y2=new JLabel("Enter IMAGINARY PART of second number");
	JButton addi= new JButton("+");
	JButton subtract= new JButton("-");
	JButton multiply= new JButton("*");
	JButton divide= new JButton("/");
	JTextField inpx1=new JTextField(25);
	JTextField inpy1=new JTextField(25);
	JTextField inpx2=new JTextField(25);
	JTextField inpy2=new JTextField(25);
	sol=new JLabel();

	f.add(x1);
	f.add(inpx1);
	f.add(y1);
	f.add(inpy1);
	f.add(x2);
	f.add(inpx2);
	f.add(y2);
	f.add(inpy2);
	f.add(addi);
	f.add(subtract);
	f.add(multiply);
	f.add(divide);
	f.add(sol);

	addi.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	a=Double.parseDouble(inpx1.getText());
	b=Double.parseDouble(inpy1.getText());
	c=Double.parseDouble(inpx2.getText());
	d=Double.parseDouble(inpy2.getText());

	ansr=a+c;
	ansi=b+d;
	sol.setText("= "+ansr+"+ "+ansi+"i");
	}
	});

	subtract.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	a=Double.parseDouble(inpx1.getText());
	b=Double.parseDouble(inpy1.getText());
	c=Double.parseDouble(inpx2.getText());
	d=Double.parseDouble(inpy2.getText());

	ansr=a-c;
	ansi=b-d;
	sol.setText("= "+ansr+"+ "+ansi+"i");
	}
	});

	multiply.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	a=Double.parseDouble(inpx1.getText());
	b=Double.parseDouble(inpy1.getText());
	c=Double.parseDouble(inpx2.getText());
	d=Double.parseDouble(inpy2.getText());

	ansr=a*c-b*d;
	ansi=a*d+b*c;
	sol.setText("= "+ansr+"+ "+ansi+"i");
	}
	});

	divide.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	a=Double.parseDouble(inpx1.getText());
	b=Double.parseDouble(inpy1.getText());
	c=Double.parseDouble(inpx2.getText());
	d=Double.parseDouble(inpy2.getText());

	ansr=(a*c+b*d)/(c*c+d*d);
	ansi=(b*c-a*d)/(c*c+d*d);
	sol.setText("= "+ansr+"+ "+ansi+"i");
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
		new SwingComplex();
		}
		});
	}

}
