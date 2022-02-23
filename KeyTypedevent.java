import java.awt.*;
import java.awt.event.*;
class myframek extends Frame
{
	String msg= "Typed Characters are: ";
	String msg1= " ";
	String msg2= " ";
	myframek (String s)
	{
		super(s);
		//setBackground(Color.cyan);
		setForeground(Color.blue);
		addKeyListener(new MyKeyAdapterk(this));
		addWindowListener((WindowListener)new MyWindowAdapterk(this));	
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 100, 100);
		g.drawString(msg1, 100, 120);
		g.drawString(msg2, 100, 130);
	}	
}
class MyKeyAdapterk extends KeyAdapter
{
	myframek o1;
	int counter=0;
	MyKeyAdapterk (myframek o3)
	{
		o1=o3;
	}
	public void keyTyped(KeyEvent ae)
	{
		counter++;
		if(counter<=20)
			o1.msg+=Character.toString(ae.getKeyChar());
		else if(counter<=40)
			o1.msg1+=Character.toString(ae.getKeyChar());
		else
			o1.msg2+=Character.toString(ae.getKeyChar());
		
		//o1.msg+=ae.getKeyChar();
		o1.repaint();
	}
}
 class MyWindowAdapterk extends WindowAdapter
{
	myframek o1;
	MyWindowAdapterk(myframek o5)
	{
		o1=o5;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}
	
}
public class KeyTypedevent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 myframek o1=new myframek("KeyTypedEventHandling");
 o1.setSize(new Dimension(500, 500));
 o1.setVisible(true);
 
	}

}
