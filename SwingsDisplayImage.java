import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJButtonFrame extends JFrame 
{
    JButton b1;
    JButton b2;
    JButton b3;
    ImageIcon i1,i2,i3;
    JLabel l1;
    MyJButtonFrame()
    {
        super("display image");
        setLayout(new FlowLayout());
        setSize(505, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       i1=new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\digital.jpg");
       i2=new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\pinkRose.jpg");
       i3=new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\fruits1.jpg ");
        b1 = new JButton("Clock");  
        b2 = new JButton("Flower");
        b3 = new JButton("Fruit");
        l1 = new JLabel();
        add(b1);
        add(b2);
        add(b3);
        add(l1);
        b1.addActionListener(new ActionListener()
        		{
        	public void actionPerformed(ActionEvent ae)
        	{
        		l1.setIcon(i1);
        	}
        		});
        b2.addActionListener(new ActionListener()
        		{
        	public void actionPerformed(ActionEvent ae)
        	{
        		l1.setIcon(i2);
        	}
        		});
        b3.addActionListener(new ActionListener()
        		{
        	public void actionPerformed(ActionEvent ae)
        	{
        		l1.setIcon(i3);
        	}
        		
        	});
        setVisible(true);
    }
}
   
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
		 public void run() 
		 {
			  new MyJButtonFrame();
		}
		 
		});
	}

}
