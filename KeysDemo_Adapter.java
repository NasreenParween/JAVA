import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements KeyListener
{
	String msg;
	String keyState;
	int x, y;
	
	myFrame()
	{
		msg="";
		keyState="";
		x=0;
		y=0;
	}
    
	public void keyPressed(KeyEvent ke)
	{
		keyState="Key pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
     keyState="Key released";
	 repaint();
	}
	
	public void keyTyped(KeyEvent ke)
	{
		keyState="Key typed";
		char ch = ke.getKeyChar();
		msg=msg+ch;
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(keyState,150,150);
		g.drawString(msg,200,200);
	}
	
}



class KeysDemo
{
	public static void main(String args[])
	{
		myFrame obj = new myFrame();
		obj.setVisible(true);
		
		obj.setSize(new Dimension(500,600));
		obj.setTitle("FRAME DEMO");
		obj.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent we) { System.exit(0); }});
		//obj.addMouseListener(obj);
		//obj.addMouseMotionListener(obj);
		obj.addKeyListener(obj);

		
	    //obj.setLayout(new FlowLayout());

		
	

	}
}