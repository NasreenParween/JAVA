import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends Frame implements WindowListener
{ 
    String msg;
    MyFrame2(String s, String s1)
    {
    	super(s);
    	setBackground(Color.pink);
    	msg=s1;
    	addWindowListener(this);
    	repaint();
    }
    public void windowClosed(WindowEvent ae)
	{
		
	}
	public void windowActivated(WindowEvent ae)
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
		g.drawString(msg,  200, 100);
	}
	
}
public class FrameBackground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyFrame2 o1=new MyFrame2("FrameBackground","Hello World");
       o1.setSize(new Dimension (350,350));
       o1.setVisible(true);
	}

}
