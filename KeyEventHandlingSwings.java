import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class PanelK extends JPanel
{
     String msg1="Typed Characters :";
     String msg2=" ";
     String msg3=" ";
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg1, 150,150);
		g.drawString(msg2, 150,170);
		g.drawString(msg3, 150,190);
	}
}
class FrameK extends JFrame
{
	PanelK p1;
	FrameK() 
	{
		super("Key Event Handling Swings");
		setSize(450,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new PanelK();
		add(p1);
		addKeyListener(new MyKeyAdapter(p1));
		setVisible(true);
		
	}
	class MyKeyAdapter extends KeyAdapter
	{
		int counter=0;
		PanelK p2;
		MyKeyAdapter(PanelK p3)
		{
			p2=p3;
		}
		public void keyTyped(KeyEvent ke)
		{
			counter++;
			if (counter<=20)
			p2.msg1+=ke.getKeyChar();
			else if (counter<=40)
				p2.msg2+=ke.getKeyChar();
			else
				p2.msg3+=ke.getKeyChar();
			p2.repaint();
		}
	}
}
public class KeyEventHandlingSwings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new FrameK();
	}
		}
		);
	}

}
