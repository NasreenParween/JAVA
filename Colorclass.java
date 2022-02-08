import java.awt.*;
import java.awt.event.*;
class framec extends Frame
{
	framec()
	{
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent ae)
		{
			setVisible(false);
		}
	});
}
	public void paint(Graphics g)
	{
		Color c= new Color(114,183,190);
		String msg=" ";
		float val[]=new float[3];
		g.setColor(c);
		g.drawLine(50, 100, 150, 100);
		g.drawRect(100, 100, 80, 100);
		g.fillRect(100, 200, 80, 100);
		g.drawLine(100, 150,  80, 100);
		Color.RGBtoHSB(114, 183, 190, val);
		msg+="hue="+val[0]+"saturation="+val[1]+"brightness="+val[2];
		g.drawString(msg, 350, 350);
		
	}
}
public class Colorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     framec o1=new framec();
     o1.setSize(400,400);
     o1.setTitle("ColorGraphics");
     o1.setVisible(true);
	}

}
