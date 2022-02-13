package insetsexampleclass;
import java.awt.*;
import java.awt.event.*;
class MyFrameInsets extends Frame
{
	int inc =25;
	int max=500;
	int min=200;
	Dimension d;
	MyFrameInsets()
	{
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me)
			{
				int w,h;
				d=getSize();
				w= (d.width+inc)>max? min :d.width+inc;
				h=(d.height+inc)>max?min:d.height+inc;
				setSize(w,h);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
	}
		public void paint(Graphics g)
		{
			d=getSize();
			int wr=400, hr=400;
			int offset=50;
			Insets i;
			i=getInsets();
			setForeground(Color.blue);
			g.drawLine(i.left,i.top,d.width-i.right, d.height -i.bottom);
			g.drawLine(i.left, d.height-i.bottom, d.width-i.right, i.top);
			if(wr<=d.width-i.right && hr<=d.height-i.bottom)
				g.drawRect(i.top+offset, i.left+offset, wr, hr);
				
	}
}

public class InsetsExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyFrameInsets o1=new MyFrameInsets();
 o1.setSize(new Dimension(400,400));
 o1.setTitle("Insets Graphics");
 o1.setVisible(true);

	}

}
