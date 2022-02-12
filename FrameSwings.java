import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  Panels extends JPanel
{
	String  s="Hello";
	//call paint function in swings
	protected void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		g.drawString(s , 100 , 100);
	}
}
class Frame
{
	JFrame o1;
	Panels p;
	Frame()
	{
		o1=new JFrame("Frame Swing");
		p=new Panels();
		o1.setSize(400,400);
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.add(p);
		o1.setBackground(Color.blue);
		o1.setVisible(true);
		
	}
}
public class FrameSwings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SwingUtilities.invokeLater(new Runnable() {
	 public void run() {
		 new Frame();
	 }
 });
	}

}
