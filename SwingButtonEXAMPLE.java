import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class frame1 extends JFrame implements ItemListener,ActionListener
{
	JButton b1;
	JToggleButton b2;
	JLabel l1,l2;
	ImageIcon i1,i2,i3;
	frame1()
	{
		super("ToggleButton");
		setSize(500,500);
		i1= new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\Marine-Pollution.jpg");
		i2= new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\saudi-34.jpg");
		i3= new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\air-pollution-smoke-emission.jpg");
		b1= new JButton(i1);
		b1.setActionCommand("Button1");
		b2= new JToggleButton("ON/OFF");
		l1= new JLabel("Hello");
		l2= new JLabel("Mahi");
		l1.setForeground(Color.magenta);
		b2.setForeground(Color.blue);
		b2.addItemListener(this);
		b2.addActionListener(this);
		b1.addActionListener(this);
		setLayout(new FlowLayout());
		b1.setPressedIcon(i3);
		b1.setRolloverIcon(i2);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		setVisible(true);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		l2.setText("you pressed"+ae.getActionCommand());
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int fact=1;
		String msg=" ";
		if(b2.isSelected())
		{
			b2.setText("Factorial");
			for(int i=1; i<=5; i++)
			fact=fact*i;
			l1.setText("Toggle Button pressed"+fact);
			getContentPane().setBackground(Color.blue);
		}
		else
		{
			int a=0,b=1,i=1,s=0;
			msg+=a+b;
			while(i<=5)
			{
				s=a+b;
				a=b;
				b=s;
				msg+=" "+s;
				i++;
			}
			b2.setText("fibonacci");
			l1.setText("Toggle Button released"+msg);	
			getContentPane().setBackground(Color.pink);
			}
	}
}
public class SwingButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new frame1();
	}
		});
	}

}
