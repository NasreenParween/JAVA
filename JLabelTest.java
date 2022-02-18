import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame {
        myFrame(){
		
		 JFrame jf=new JFrame("EXPLORING SWING");
		 //jf.setLayout(new FlowLayout());
         jf.setSize(450,500);
	     jf.setVisible(true);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel jlb=new JLabel("This is a JLabel Test");
		 ImageIcon imgc = new ImageIcon("hourglass.jpg");
		 JLabel jlb1=new JLabel(imgc);
		 JLabel jlb2=new JLabel("This is a JLabel Test",imgc,JLabel.RIGHT);
		 
		 jf.add(jlb);
		 jf.add(jlb1);
		 jf.add(jlb2);
		 
		}	 
}

class JLabelTest{
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
