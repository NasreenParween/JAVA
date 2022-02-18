import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame {
        myFrame(){
		
		 JFrame jf=new JFrame("EXPLORING SWING");
		 jf.setLayout(new FlowLayout());
         jf.setSize(450,500);
	     jf.setVisible(true);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel jlb=new JLabel("This is a JTextField Test");
		 JTextField jtf = new JTextField(15);
		 
		 jf.add(jlb);
		 jf.add(jtf);
		 
		}	 
}

class JTextFieldTest{
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new myFrame();
			}
		});
	}
}
