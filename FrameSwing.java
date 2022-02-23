import javax.swing.*;
import java.awt.*;
class PanelS extends JPanel
{
	String s="Hello";
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.pink);
		g.drawString(s, 100, 100);
	}
}
class FrameS extends JFrame
{
	PanelS p;
	FrameS()
	{
		super("Frame Swing");
		p=new PanelS();
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		setVisible(true);
	}
}
public class FrameSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new FrameS();
	}
		}
		);
	}

}
