import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
class pane1 extends JPanel
{
	Insets i;
	Random r1;
	int w,h;
	//Dimension d;
	pane1()
	{
		setBorder(BorderFactory.createLineBorder(Color.blue,2));
		r1=new Random();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int x1,x2,y1,y2;
		//d.getSize();
		i= getInsets();
		w=getWidth();
		h=getHeight();
		System.out.println("width"+w+"height"+h);
		System.out.println("top"+i.top+"left"+i.left+"right"+i.right+"bottom"+i.bottom);
		for(int j=0; j<=5; j++)
		{
			x1=r1.nextInt(w-i.left);
			y1=r1.nextInt(h-i.bottom);
			x2=r1.nextInt(w-i.left);
			y2=r1.nextInt(h-i.bottom);
			System.out.println("x1"+x1+"x2"+x2+"y1"+y1+"y2"+y2);
			g.drawLine(x1, y1, x2, y2);
		}
		
	}
}

public class SwingInsets {
	JFrame j;
	pane1 p;
	SwingInsets()
	{
		j=new JFrame("INSETS_SWINGS");
		j.setSize(500,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new pane1();
		j.add(p);
		j.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SwingUtilities.invokeLater(new Runnable()
		 {
	 public void run()
	 {
		 new SwingInsets();
	 }
		 });
	}

}
