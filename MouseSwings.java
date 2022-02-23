import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class panel extends JPanel
{
	String s="Hello";
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(s, 50, 100);
	}
}
class Mouse extends JFrame
{
	Dimension d;
	//JFrame o1;
	panel p;
	Mouse()
	{
		super("MouseEventHndling swings");
		p=new panel();
		//setTitle("");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d=getSize();
		p.setLayout(new FlowLayout());
		add(p);
		addMouseListener(new MyMouseAdapter(this, d));
		setVisible(true);
	}
}
class MyMouseAdapter extends MouseAdapter
{
	JFrame o1;
	Dimension d;
	String msg=" ";
	MyMouseAdapter(JFrame o2, Dimension d1)
	{
		o1=o2;
		d=d1;
	}
	public void mouseEntered(MouseEvent me)
	{
		Dimension d1;
		d1=o1.getSize();
		o1.setSize(d1.width*3, d1.height*3);
		o1.repaint();	
		
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked window size ="+d.width+"and"+d.height;
		o1.setSize(d);
		
	}
	public void mouseExited(MouseEvent me)
	{
		o1.setVisible(false);
	}
}
public class MouseSwings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
		new Mouse();
	}
}
);
	}
}
