import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingsDemo extends JFrame implements ActionListener
{
	JButton b1, b2;
	SwingsDemo()
	{
		setTitle("Button swing program");
		b1= new JButton ("Red");
		b2= new JButton("Blue");
		setSize(new Dimension (500,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);		
}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();

		if(s.equals("Red"))
			getContentPane().setBackground(Color.RED);
		if(s.equals("Blue"))
			getContentPane().setBackground(Color.BLUE);
		
	}
}

public class SwingButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SwingUtilities.invokeLater(new Runnable()
		  {
	  public void run() {
		  new SwingsDemo();
	  }
		  });
	}
}
