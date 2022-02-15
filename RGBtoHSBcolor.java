import java.awt.*;
import java.awt.event.*;
class bordercolor extends Frame
{
	bordercolor()
	{
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
		
	}
	public void paint (Graphics g)
	{
		Color c=new Color(128,126,110);
		float val[]=new float[3];	
		String msg=" ";
		g.setColor(c);
		g.drawLine(50,100,150,100);
		g.drawRect(200, 180, 80, 100);
		g.fillRect(100, 250, 80, 100);
		Color.RGBtoHSB (128, 126, 110, val);
		msg+="val0"+val[0]+"val1"+val[1]+"val3"+val[2];
		g.drawString(msg,  100, 100);
	}
}
public class RGBtoHSBcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  bordercolor b=new bordercolor();
  b.setTitle(" color ");
  b.setSize(500,500);
  b.setVisible(true);
  
	}

}
