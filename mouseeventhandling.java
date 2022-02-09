import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener,WindowListener
{
	String msg="Hello";
	MyFrame(String s)
	{ 
		super (s);
		addMouseListener(this);
		addWindowListener(this);
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
public void mouseClicked(MouseEvent ae1)
	{
		msg="Mouse Clicked window size ";
		repaint();
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
	public void mouseEntered(MouseEvent ae1)
	{
		msg="Mouse Entered";
		repaint();	
	}
	public void mouseExited(MouseEvent ae1)
	{
		msg="Mouse Exited";
		repaint();
				
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,  100, 150);
	}
	
}
public class mouseeventhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyFrame o1=new MyFrame("MouseEventHandling");
o1.setSize(500,500);
o1.setVisible(true);
	}

}
