import java.awt.*;
import java.awt.event.*;
import java.io.*;
class myFrame2 extends Frame implements KeyListener,WindowListener
{
	String msg=" ";
	String msg1=" ";
	int x, y;
	
	myFrame2(String s)
	{
		super(s);
		addKeyListener(this);
		addWindowListener(this);
		setBackground(Color.orange);

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
	public void keyPressed(KeyEvent ke)
	{
		msg="Key pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
     msg="Key released";
	 repaint();
	}
	
	public void keyTyped(KeyEvent ke)
	{
		msg="Key typed";
		msg1+= ke.getKeyChar();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,50,150);
		g.drawString(msg1,50,200);
	}
	
}
 class KeysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame2 obj = new myFrame2("KeysDemo");
		obj.setSize(new Dimension(500,600));
		obj.setTitle("FRAME DEMO");
		obj.setVisible(true);
	}

}
