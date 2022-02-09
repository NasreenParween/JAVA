import java.awt.*;
import java.awt.event.*;
class MyFrame1 extends Frame implements WindowListener
{
	String msg=" ";
	MyFrame1(String s, String s1)
	{ 
		super (s);
		setBackground(Color.pink);
		msg=s1;
		addWindowListener(this);
		repaint();
	}
	public void windowActivated(WindowEvent ae)
	{
		
	}
	public void windowClosed(WindowEvent ae)
	{
			
	}
	public void windowClosing(WindowEvent ae)
	{
		setVisible(false);
	}
	public void windowDeactivated(WindowEvent ae)
	{
		
	}
	public void windowDeiconified(WindowEvent ae)
	{
		
	}
	public void windowIconified(WindowEvent ae)
	{
		
	}
	public void windowOpened(WindowEvent ae)
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,  100, 150);
	}
	
}
public class framebackground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame1 o2 = new MyFrame1("FrameBackground"," Hello");
		o2.setSize(500,500);
		o2.setVisible(true);
	}

}
