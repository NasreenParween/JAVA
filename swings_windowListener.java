import java.awt.*;
import java.awt.event.*;
import java.io.*;
class myFrame2 extends Frame implements MouseListener,WindowListener
{
	String msg="Hello";
	Dimension d1 ;
	myFrame2 (String s)
	{ 
		super (s);
		addMouseListener(this);
		addWindowListener(this);
		setSize(300, 300);
		d1=getSize();
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
	public void mousePressed(MouseEvent ae1)
	{
		msg="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent ae1)
	{
		msg="Mouse Released";
		repaint();
	}
	public void mouseClicked(MouseEvent ae1)
	{
		Dimension d;
		msg="Mouse Clicked window size ="+d1.width+"and"+d1.height;
		d =getSize();
		setSize(d.width*1/2,d.height*1/2);
		setBackground(Color.cyan);
		setSize(d1);
		repaint();
	}
	public void mouseEntered(MouseEvent ae1)
	{
		Dimension d;
		msg="Mouse Entered";
		d =getSize();
		setSize(d.width*2,d.height*2);
		setBackground(Color.blue);
		repaint();	
	}
	public void mouseExited(MouseEvent ae1)
	{
		msg="Mouse Exited";
		repaint();
		setVisible(false);
				
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,  50, 100);
	}
	
}
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame2 m1=new myFrame2("MouseEventHandling");
	     m1.setVisible(true);
	}

}
