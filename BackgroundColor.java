import java.awt.*;
import java.awt.event.*;
class color extends Frame
{
	int count;
	Label l1;
	color()
	{
		l1=new Label(".....PRINCESS....");
		add(l1);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
				});
		addMouseListener(new MymouseAdapter());	
	}
	class MymouseAdapter extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			count++;
			if(count==7)
				count=1;
			repaint();
		}
	}
	public void paint(Graphics g)
	{
	if(count==1)
		setBackground(Color.red);
	else if(count==2)
		setBackground(Color.green);
	else if(count==3)
		setBackground(Color.blue);
	else if(count==4)
		setBackground(Color.pink);
	else if(count==5)
		setBackground(Color.yellow);
	else if(count==6)
		setBackground(Color.cyan);
	}
}
public class BackgroundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  color c=new color();
  c.setSize(500,500);
  c.setLayout(new FlowLayout());
  c.setTitle("BackgroundColor");
  c.setVisible(true);
	}

}
