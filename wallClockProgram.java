import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends JFrame implements ActionListener
{
	JLabel l1 ,l2;
	JButton b1,b2;
	ImageIcon i1,i2;
	ButtonDemo()
	{
		//JFrame f1=new JFrame(" ButtonDemo");
		super(" Button Demo");
		setSize(new Dimension(600,600));
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    i1=new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\wallClock1.jpg");
	    i2=new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\wallClock2.jpg");
		b1=new JButton(i1);
		b2=new JButton(i2);
		l1= new JLabel(" CHOOSE A CLOCK ");
		l2= new JLabel("Mahi");
		b1.setActionCommand("wallClock1");
		b1.addActionListener(this);
		b2.setActionCommand("wallClock2");
		b2.addActionListener(this);
		add(b1);
		add(l1);
		add(b2);
	   add(l2);
	  setVisible(true);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText("you selected"+ae.getActionCommand());
		System.out.println(ae.getActionCommand());
		l2.setText("you selected"+ae.getActionCommand());
		System.out.println(ae.getActionCommand());
	}
}

public class wallClockProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new ButtonDemo();
	}
		});
	}
}
